class Solution {
    public String solution(String new_id) {
        //1단계
        new_id = new_id.toLowerCase();

        //2단계
        new_id = new_id.replaceAll("[^a-z0-9_.-]", ""); // \W:알파벳이나 숫자가 아닌 나머지문자, \w :알파벳이나 숫자
        
        //3단계
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(new_id.charAt(0));

        for (int i = 1; i < new_id.length(); i++) {
            if (new_id.charAt(i) == '.' && new_id.charAt(i - 1) == '.') {
                stringBuilder = stringBuilder;
            } else {
                stringBuilder.append(new_id.charAt(i));
            }
        }

        new_id = stringBuilder.toString();
        //4단계
        if (new_id.equals(".")) {
            new_id = "";
        } else {
            if (new_id.charAt(0) == '.') new_id = new_id.substring(1);
            if (new_id.charAt(new_id.length() - 1) == '.') new_id = new_id.substring(0, new_id.length() - 1);
        }

        //5단계
        if (new_id.equals("")) new_id = "a";
        System.out.println("5단계 : new_id = " + new_id);

        //6단계
        if (new_id.length() >= 16) {
            new_id = new_id.substring(0, 15);
        }

        if (new_id.charAt(new_id.length() - 1) == '.') new_id = new_id.substring(0, new_id.length() - 1);

        //7단계
        if (new_id.length() <= 2) {
            while (new_id.length() < 3) {
                new_id += new_id.charAt(new_id.length() - 1);
            }
        }
        return new_id;
    }
}
    