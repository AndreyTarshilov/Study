public class MakeTextByRoles {
    public static String printTextPerRole(String[] roles, String[] textLines) {
        String result = null;
        int lengthRoles = roles.length;
        int lengthText = textLines.length;
        System.out.println(lengthRoles);
        System.out.println(lengthText);
        StringBuilder [] resultRoles = new StringBuilder[lengthRoles];
        for (int i=0; i<lengthRoles; i++) {
            //resultRoles[i] = resultRoles[i].append(roles[i]+ ":" + "\n");
            for (int j=0; j<lengthText; j++) {
                    if (textLines[j].startsWith(roles[i] + ":")) {
                        resultRoles[i] = resultRoles[i].append((j+1) + ") " + textLines[j] + "\n");
                    }
                }
            result = new String(resultRoles[i]);
            //return result;
        }
        return result;
    }

    public static void main(String[] args) {
        String [] roles= {
                "Городничий","Аммос Федорович",
                "Артемий Филиппович",
                "Лука Лукич"};
        String [] textLines={
                "Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
                "Аммос Федорович: Как ревизор?",
                "Артемий Филиппович: Как ревизор?",
                "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
                "Аммос Федорович: Вот те на!",
                "Артемий Филиппович: Вот не было заботы, так подай!",
                "Лука Лукич: Господи боже! еще и с секретным предписаньем!"};

        System.out.println(printTextPerRole(roles, textLines));
    }
}
