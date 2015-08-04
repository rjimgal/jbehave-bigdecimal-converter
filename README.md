# jbehave-bigdecimal-converter

This maven project demonstrates the possible bad usages that BigDecimal (NumericConverter) JBehave allows.

## Run using Maven

From a terminal, just execute:

`mvn clean install`

Build will fail due to `java.lang.RuntimeException: ********** This shouldn't be executed **********`

Instead, I would expect it to fail due to a `NumberFormatException` since 0x1A is not a valid input for BigDecimal constructor.
