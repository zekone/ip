package exceptions;

import common.ExceptionMessage;

/**
 * Custom exception class for representing missing descriptions when adding new
 * tasks.
 *
 * @author Ho Khee Wei
 */
public class MissingDescriptionException extends ThorndikeException {

    /**
     * Constructs a MissingDescriptionException with a message indicating that the
     * description is missing.
     *
     * @param task The task for which the description is missing.
     */
    public MissingDescriptionException(String task) {
        super(String.format(ExceptionMessage.MISSING_DESCRIPTION, task));
    }

}
