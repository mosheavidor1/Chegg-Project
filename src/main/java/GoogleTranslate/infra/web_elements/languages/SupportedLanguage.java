package GoogleTranslate.infra.web_elements.languages;

import static GoogleTranslate.infra.web_elements.languages.LanguageElements.*;

public enum SupportedLanguage {

   //Languages enums of detected and supported.
        HEBREW(hebrew_detected_element, hebrew_detected,TRANSLATION_CHECK_TEXT),
        JAPANESE(JAPANESE_DETECT_ELEMENT, JAPANESE_DETECT,TRANSLATION_CHECK_TEXT),
        GREEK(GREEK_DETECT_ELEMENT, GREEK_DETECT,TRANSLATION_CHECK_TEXT),
        FRENCH(FRENCH_DETECT_ELEMENT, FRENCH_DETECT,TRANSLATION_CHECK_TEXT),
        DUTCH(DUTCH_DETECT_ELEMENT, DUTCH_DETECT,TRANSLATION_CHECK_TEXT);

        private final String detectElement;
        private final String expectedVerification;
        private final String expectedText;




        SupportedLanguage(String detectElement, String expectedVerification,String expectedText) {
            this.detectElement = detectElement;
            this.expectedVerification = expectedVerification;
            this.expectedText = expectedText;
        }

        public String getDetectElement() {
            return detectElement;
        }

        public String expectedVerification() {
            return expectedVerification;
        }

            public String getExpectedText() {
                return expectedText;
        }
    }


