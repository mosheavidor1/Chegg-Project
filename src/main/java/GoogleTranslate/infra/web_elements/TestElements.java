package GoogleTranslate.infra.web_elements;

public class TestElements {



    //Google translate main url :

    public  static final String GOOGLE_TRANSLATE_URL="https://translate.google.com/";


//Text typing input test


public  static final String SOURCE_LANGUAGE="textarea[aria-label='Source text']";


//Print the text to the consul
public  static  final  String PRINT_TEXT="//span[@class='ryNqvb']";


//Detect the Hebrew language
public  static  final  String HEBREW_DETECT_ELEMENT="//span[normalize-space()='Hebrew - detected']";

//Make sure the translation is correct - text  .
public  static  final  String TRANSLATION_CHECK_TEXT="I am an automation engineer";

//Make sure the translation is correct - element  .
public  static  final  String TRANSLATION_CHECK="//span[normalize-space()='I am an automation engineer']";


//For Hebrew detection verification
public  static  final  String HEBREW_DETECT="HEBREW - DETECTED";
















}
