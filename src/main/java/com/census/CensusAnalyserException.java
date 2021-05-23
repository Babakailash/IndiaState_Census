package com.census;

public class CensusAnalyserException extends Exception{
    enum CensusExceptionType {
        No_SUCH_FILE, INCORRECT_DATA_ISSUE, SOME_OTHER_IO_EXCEPTION, DELIMITER_ISSUE, NO_SUCH_FILE, NO_SUCH_CLASS
    }
    CensusExceptionType type;
    private String message;

    public CensusAnalyserException(CensusExceptionType type, String message) {
        super(message);
        this.type = type;
    }
}
