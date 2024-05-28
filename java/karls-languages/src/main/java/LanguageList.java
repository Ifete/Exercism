import java.util.ArrayList;
import java.util.List;

public class LanguageList {
    private final List<String> languages = new ArrayList<>();

    public boolean isEmpty() {
        boolean isEmpty=false;
        if (languages.size()<=0){
            isEmpty=true;
        }
        return isEmpty;
    }

    public void addLanguage(String language) {
        languages.add(language);
    }

    public void removeLanguage(String language) {
        languages.remove(language);
    }

    public String firstLanguage() {
        return languages.get(0);
    }

    public int count() {
        return languages.size();
    }

    public boolean containsLanguage(String language) {
        return languages.contains(language);
    }

    public boolean isExciting() {
        boolean isExciting=false;
        for (String lang:
             languages) {
            if(lang.equalsIgnoreCase("Java") || lang.equalsIgnoreCase("Kotlin")){
                isExciting = true;
            }
        }
        return isExciting;
    }
}
