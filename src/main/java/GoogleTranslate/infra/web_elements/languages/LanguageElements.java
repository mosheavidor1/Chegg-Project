package GoogleTranslate.infra.web_elements.languages;

public class LanguageElements {



    //Google translate main url :

public  static final String GOOGLE_TRANSLATE_URL="https://translate.google.com/";








//Text typing input test


public  static final String SOURCE_LANGUAGE="textarea[aria-label='Source text']";





//Print the text to the consul
public  static  final  String PRINT_TEXT="//span[@class='ryNqvb']";







//Languages to detect :

    //Detect the Hebrew language
    public  static  final  String hebrew_detected_element="//span[normalize-space()='Hebrew - detected']";


    public  static  final  String hebrew_detected="Hebrew - detected";










    //  Detect the JAPANESE language

    public  static  final  String JAPANESE_DETECT_ELEMENT="//span[normalize-space()='Japanese - detected']";



    //For JAPANESE detection verification
    public  static  final  String JAPANESE_DETECT="Japanese - detected";





    //  Detect the GREEK language

    public  static  final  String GREEK_DETECT_ELEMENT="//span[normalize-space()='Greek - detected']";



    //For GREEK detection verification
    public  static  final  String GREEK_DETECT="GREEK - DETECTED";





    //  Detect the FRENCH language

    public  static  final  String FRENCH_DETECT_ELEMENT="//span[normalize-space()='French - detected']";



    //For FRENCH detection verification
    public  static  final  String FRENCH_DETECT="FRENCH - DETECTED";






  //  Detect the Dutch language

    public  static  final  String DUTCH_DETECT_ELEMENT="//span[normalize-space()='Dutch - detected']";



    //For Dutch detection verification
    public  static  final  String DUTCH_DETECT="DUTCH - DETECTED";




    //Make sure the translation is correct - text  .
    public  static  final  String TRANSLATION_CHECK_TEXT="This text is translated";











}
