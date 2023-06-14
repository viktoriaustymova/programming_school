public class Dictionary {
    private DictionaryPair[] words;
    private int count;

    public Dictionary(){
        this.words = new DictionaryPair[3];
        this.count = 0;
    }

    private static class DictionaryPair {
        final String key; // ключ
        String value; // значение

        DictionaryPair(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    public class Translator {
        String[] transletedWords;

        Translator(){
            this.transletedWords = new String[words.length];
        }

        public String[] translate(String[] words){
            for (int i = 0;i < count; i++){
                transletedWords[i] = get(words[i]);
            }
            return transletedWords;
        }
    }

    public void put(String key, String value) {
        for (int i = 0; i < count; i++) {
            if (words[i].key.equals(key)) {
                words[i].value =value;
                return;
            }
        }
        words[count] = new DictionaryPair(key, value);
        count++;
     }

    public String get(String key) {
        for (int i = 0; i < count; i++) {
            if (words[i].key.equals(key)) {
                return words[i].value;
            }
        }
        throw new IllegalArgumentException("Ключа <" + key + "> в таблице нет");
    }
}
