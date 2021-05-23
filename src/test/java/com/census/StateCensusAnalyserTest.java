package com.census;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class StateCensusAnalyserTest {

    public static final String STATECODES_CSVFILE = "C:\\Users\\BABA\\Census_Analyzer\\src\\main\\resources\\IndiaStateCode.csv";
    public static final String STATECENSUS_CSVFILE = "C:\\Users\\BABA\\Census_Analyzer\\src\\main\\resources\\IndiaStateCensusData.csv";
    public static final String WRONG_FILE = "/useless.txt";


    @Test
    public void GivenTheStateCodesCsvFile_IfHasCorrectNumberOfRecords_ShouldReturnTrue() throws IOException {
        try {
            int count = StateCensusAnalyser.openCsvBuilder(STATECODES_CSVFILE, CSVState.class);
            System.out.println(count);
            Assertions.assertEquals(37, count);
        } catch (CensusAnalyserException e) {
            e.printStackTrace();
        }
    }
}