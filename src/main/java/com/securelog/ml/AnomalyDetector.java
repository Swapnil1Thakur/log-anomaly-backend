package com.securelog.ml;

import com.securelog.model.HttpLog;


public interface AnomalyDetector {

    String getName();


    double score(HttpLog log);


    default double threshold() {
        return 0.5;
    }

    default boolean isAnomaly(HttpLog log) {
        return score(log) >= threshold();
    }
}
