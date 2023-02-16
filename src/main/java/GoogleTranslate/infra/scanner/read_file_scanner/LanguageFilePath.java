package GoogleTranslate.infra.scanner.read_file_scanner;

public enum LanguageFilePath {

    HEBREW("C:\\Users\\Moshe.Avidor\\IdeaProjects\\Chegg-Project\\src\\main\\utilities\\Files_to_translate\\Hebrew.txt"),
    JAPANESE("C:\\Users\\Moshe.Avidor\\IdeaProjects\\Chegg-Project\\src\\main\\utilities\\Files_to_translate\\Japanese.txt"),
    DUTCH("C:\\Users\\Moshe.Avidor\\IdeaProjects\\Chegg-Project\\src\\main\\utilities\\Files_to_translate\\Dutch.txt"),
    GREEK("C:\\Users\\Moshe.Avidor\\IdeaProjects\\Chegg-Project\\src\\main\\utilities\\Files_to_translate\\Greek.txt"),
    FRENCH("C:\\Users\\Moshe.Avidor\\IdeaProjects\\Chegg-Project\\src\\main\\utilities\\Files_to_translate\\French.txt");

    private String filePath;

    LanguageFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getFilePath() {
        return filePath;
    }


}


