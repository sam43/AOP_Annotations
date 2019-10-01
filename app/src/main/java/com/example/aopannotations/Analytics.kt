package com.example.aopannotations

import android.util.Log

@Target(AnnotationTarget.TYPE, AnnotationTarget.CLASS, AnnotationTarget.FUNCTION,
    AnnotationTarget.FIELD, AnnotationTarget.VALUE_PARAMETER, AnnotationTarget.EXPRESSION
)
@Retention(/*AnnotationRetention.RUNTIME, */AnnotationRetention.SOURCE)
@MustBeDocumented
@Repeatable
annotation class Analytics

@Analytics class LogEvent {
    @Analytics fun analyticsLogEvent(@Analytics value: Int): Int {
        Log.d("analytics","got it")
        return (@Analytics 1)
    }
}