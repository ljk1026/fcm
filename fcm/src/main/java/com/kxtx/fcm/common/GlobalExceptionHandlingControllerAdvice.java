package com.kxtx.fcm.common;

import com.kxtx.fcm.exception.BusinessRuntimeException;
import com.kxtx.fcm.vo.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.sql.SQLException;

/**
 * controller异常统一处理
 * @Auther: jiankun.liu
 * @Date: 2018/8/22 18:58
 * @Description:
 */
@RestController
@ControllerAdvice
public class GlobalExceptionHandlingControllerAdvice {


    protected Logger logger;

    public GlobalExceptionHandlingControllerAdvice() {
        logger = LoggerFactory.getLogger(getClass());
    }

	/* - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - */
	/* . . . . . . . . . . . . . EXCEPTION HANDLERS . . . . . . . . . . . . . . */
	/* - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - */

    /**
     * Convert a predefined exception to an HTTP Status code
     */
    @ResponseStatus(value = HttpStatus.CONFLICT, reason = "Data integrity violation")
    // 409
    @ExceptionHandler(DataIntegrityViolationException.class)
    public void conflict() {
        logger.error("Request raised a DataIntegrityViolationException");
        // Nothing to do
    }

    /**
     * Convert a predefined exception to an HTTP Status code and specify the
     * name of a specific view that will be used to display the error.
     *
     * @return Exception view.
     */
    @ExceptionHandler({ SQLException.class, DataAccessException.class })
    public Response databaseError(Exception exception) {

        logger.error("Request raised " + exception.getClass().getSimpleName());
        return  Response.failureRep(BaseConstant.ApiResult.FAILURE_SQL_CODE,"SQL ERROR:"+exception.getMessage());
    }

    /**
     * Demonstrates how to take total control - setup a model, add useful
     * information and return the "support" view name. This method explicitly
     * creates and returns
     *
     * @param req
     *            Current HTTP request.
     * @param exception
     *            The exception thrown - always {@link BusinessRuntimeException}.
     * @return The model and view used by the DispatcherServlet to generate
     *         output.
     * @throws Exception
     */
    @ExceptionHandler(BusinessRuntimeException.class)
    public Response BusinessRuntimeError(HttpServletRequest req, Exception exception)
            throws Exception {
        // Rethrow annotated exceptions or they will be processed here instead.
        //如果当前异常已经被注解,就抛出原来的异常
        if(AnnotationUtils.findAnnotation(exception.getClass(),
                ResponseStatus.class) != null){
            throw exception;
        }
        return Response.failureRep(BaseConstant.ApiResult.FAILURE_CODE,exception.getMessage());
    }

    /**
     * Demonstrates how to take total control - setup a model, add useful
     * information and return the "support" view name. This method explicitly
     * creates and returns
     *
     * @param req
     *            Current HTTP request.
     * @param exception
     *            The exception thrown - always {@link BusinessRuntimeException}.
     * @return The model and view used by the DispatcherServlet to generate
     *         output.
     * @throws Exception
     */
    @ExceptionHandler(RuntimeException.class)
    public Response runtimeError(HttpServletRequest req, Exception exception)
            throws Exception {
        // Rethrow annotated exceptions or they will be processed here instead.
        //如果当前异常已经被注解,就抛出原来的异常
        if(AnnotationUtils.findAnnotation(exception.getClass(),
                ResponseStatus.class) != null){
            throw exception;
        }
        return Response.failureRep(BaseConstant.ApiResult.FAILURE_CODE,"未知异常:"+exception.getMessage());
    }
}
