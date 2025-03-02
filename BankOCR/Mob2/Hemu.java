@Test
void testValidOCRParsing() {
    String[] ocrInput = {
        "   _  _     _  _  _  _  _ ", 
        " | _| _||_||_ |_   ||_||_|",
        " ||_  _|  | _||_|  ||_| _|"
    };

    InvokeMainTestCase.MainMethodResult result = invokeMain(ocrInput);
    assertThat(result.getTextWrittenToStandardOut(), containsString("123456789"));
}
