package uk.nhs.nhsx.sonar.android.app.util

import org.joda.time.DateTime

private const val DATE_TIME_FORMAT = "yyyy-MM-dd'T'HH:mm:ss'Z'"
private const val SPINNER_DATE_TIME_FORMAT = "EEEE, MMMM dd"

fun DateTime.toUtcIsoFormat(): String = toString(DATE_TIME_FORMAT)

fun DateTime.toUiSpinnerFormat(): String = toString(SPINNER_DATE_TIME_FORMAT)
