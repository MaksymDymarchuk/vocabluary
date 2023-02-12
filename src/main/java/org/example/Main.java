package org.example;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введіть 1 або 2");
        int a = in.nextInt();
        switch (a){
            case 1 : dictionary();
            break;
            case 2 : dictionar();
            break;
    }}
    public static void dictionary(){
        Random words = new Random();
        for (int i = 0; i < 120; i++){
            int t = words.nextInt(30,182);
            //System.out.println(t);
            if (t == 0){arrayz("glimpse","уявлення");}
                else if (t == 1) {arrayz("deal with","розбиратись");}
            else if (t == 2) {arrayz("opportunity","можливість");}
            else if (t == 3) {arrayz("store","зберігати");}
            else if (t == 4) {arrayz("upvote","голосувати за");}
            else if (t == 5) {arrayz("accommodate","розмістити");}
            else if (t == 6) {arrayz("aid","допомогати");}
            else if (t == 7) {arrayz("adopt","приймати");}
            else if (t == 8) {arrayz("gain","виграш");}
            else if (t == 9) {arrayz("increase","збільшувати");}
            else if (t == 10) {arrayz("essential","істотний");}
            else if (t == 11) {arrayz("instead","замість");}
            else if (t == 12) {arrayz("divide","ділити");}
            else if (t == 13) {arrayz("tribe","плем'я");}
            else if (t == 14) {arrayz("clash","зіткнення");}
            else if (t == 15) {arrayz("comprehension","розуміння");}
            else if (t == 16) {arrayz("stuck","зупинитися");}
            else if (t == 17) {arrayz("confident","впевнений");}
            else if (t == 18) {arrayz("request","запит");}
            else if (t == 19) {arrayz("generalized","узагальнений");}
            else if (t == 20) {arrayz("impact","вплив");}
            else if (t == 21) {arrayz("unusable","невикористовуваємий");}
            else if (t == 22) {arrayz("impractical","недоцільно");}
            else if (t == 23) {arrayz("affiant","упорядник");}
            else if (t == 24) {arrayz("compiler","упорядник");}
            else if (t == 25) {arrayz("introduce","представляти");}
            else if (t == 26) {arrayz("except","за виключенням");}
            else if (t == 27) {arrayz("expect","очікувати");}
            else if (t == 28) {arrayz("achieve","досягти");}
            else if (t == 29) {arrayz("consider","розглянути");}
            else if (t == 30) {arrayz("definitely","безумовно");}
            else if (t == 31) {arrayz("according","відповідно");}
            else if (t == 32) {arrayz("corresponding","відповідний");}
            else if (t == 33) {arrayz("matches","відповідає");}
            else if (t == 34) {arrayz("determine","визначення");}
            else if (t == 35) {arrayz("variable","змінна");}
            else if (t == 36) {arrayz("specify","вказати");}
            else if (t == 37) {arrayz("receive","отримувати");}
            else if (t == 38) {arrayz("sequence","послідовність");}
            else if (t == 39) {arrayz("compared","в порівнянні");}
            else if (t == 40) {arrayz("search","пошук");}
            else if (t == 41) {arrayz("mutable","мінливий");}
            else if (t == 42) {arrayz("unless","хіба що");}
            else if (t == 43) {arrayz("otherwise","інакше");}
            else if (t == 44) {arrayz("thrown","кинутий");}
            else if (t == 45) {arrayz("pair","пара");}
            else if (t == 46) {arrayz("addition","додавати");}
            else if (t == 47) {arrayz("application","додаток");}
            else if (t == 48) {arrayz("offer","пропонувати, спроба");}
            else if (t == 49) {arrayz("advice","порада");}
            else if (t == 50) {arrayz("allow","дозволяти");}
            else if (t == 51) {arrayz("accomplish","виконувати");}
            else if (t == 52) {arrayz("suppress","заборонити");}
            else if (t == 53) {arrayz("empty","порожній");}
            else if (t == 54) {arrayz("scratch","написаний");}
            else if (t == 55) {arrayz("parse","розібрати");}
            else if (t == 56) {arrayz("stain","пятно");}
            else if (t == 57) {arrayz("available","доступний");}
            else if (t == 58) {arrayz("regex","регулярний вираз");}
            else if (t == 59) {arrayz("counter","лічільник");}
            else if (t == 60) {arrayz("consider","розглянути");}
            else if (t == 61) {arrayz("available","доступний");}
            else if (t == 62) {arrayz("sequence","послідовність");}
            else if (t == 63) {arrayz("receive","отримувати");}
            else if (t == 64) {arrayz("specify","вказати");}
            else if (t == 65) {arrayz("determine","визначення");}
            else if (t == 66) {arrayz("consistent","послідовний");}
            else if (t == 67) {arrayz("plenty","багато");}
            else if (t == 68) {arrayz("afford","мати можливість");}
            else if (t == 69) {arrayz("adore","обожнюю");}
            else if (t == 70) {arrayz("jealous","заздрістний");}
            else if (t == 71) {arrayz("envy","заздрість");}
            else if (t == 72) {arrayz("letting","дозволяти");}
            else if (t == 73) {arrayz("observation","спостереження");}
            else if (t == 74) {arrayz("simple","простий");}
            else if (t == 75) {arrayz("incredible","неймовірно");}
            else if (t == 76) {arrayz("wicked","злий");}
            else if (t == 77) {arrayz("amazing","дивовижний");}
            else if (t == 78) {arrayz("workout","тренування");}
            else if (t == 79) {arrayz("assessment","оцінка");}
            else if (t == 80) {arrayz("sign","знак");}
            else if (t == 81) {arrayz("work it out","зроби це");}
            else if (t == 82) {arrayz("response","відповідь");}
            else if (t == 83) {arrayz("throughput","всюди");}
            else if (t == 84) {arrayz("disable","відключити");}
            else if (t == 85) {arrayz("introduction","вступ");}
            else if (t == 86) {arrayz("freshers","першокурсник");}
            else if (t == 87) {arrayz("introduced","введено");}
            else if (t == 88) {arrayz("bored","нудно");}
            else if (t == 89) {arrayz("frequent","частий");}
            else if (t == 90) {arrayz("cave","печера");}
            else if (t == 91) {arrayz("torch","ліхтар");}
            else if (t == 92) {arrayz("trap","пастка");}
            else if (t == 93) {arrayz("occasionally","час від часу");}
            else if (t == 94) {arrayz("belong","належати");}
            else if (t == 95) {arrayz("brackets","дужки");}
            else if (t == 96) {arrayz("lonely","самотній");}
            else if (t == 97) {arrayz("charity","благодійність");}
            else if (t == 98) {arrayz("gang","банда");}
            else if (t == 99) {arrayz("redundant","надлишковий");}
            else if (t == 100) {arrayz("attempt","спроба");}
            else if (t == 101) {arrayz("highlight","підсвічувати");}
            else if (t == 102) {arrayz("exactly","точно");}
            else if (t == 103) {arrayz("contribute","вносити, сприяти");}
            else if (t == 104) {arrayz("guess","вгадати");}
            else if (t == 105) {arrayz("specify","вказати");}
            else if (t == 106) {arrayz("expend","витрачати");}
            else if (t == 107) {arrayz("contain","містять");}
            else if (t == 108) {arrayz("expand","поширювати");}
            else if (t == 109) {arrayz("statement","заява");}
            else if (t == 110) {arrayz("whole","ціле");}
            else if (t == 111) {arrayz("expression","вираз");}
            else if (t == 112) {arrayz("noisy","галасливий");}
            else if (t == 113) {arrayz("noise","шум");}
            else if (t == 114) {arrayz("tracksuit","спортивний костюм");}
            else if (t == 115) {arrayz("brand new","новинка");}
            else if (t == 116) {arrayz("trainers","кросівки");}
            else if (t == 117) {arrayz("hurry","поспішати");}
            else if (t == 118) {arrayz("quiet","спокійно");}
            else if (t == 119) {arrayz("quiet the opposite","зовсім навпаки");}
            else if (t == 120) {arrayz("quite","цілком");}
            else if (t == 121) {arrayz("harmless","нешкідливий");}
            else if (t == 122) {arrayz("hang around","бродити навкруги");}
            else if (t == 123) {arrayz("tired","втомитися");}
            else if (t == 124) {arrayz("putting up with","терпіти");}
            else if (t == 125) {arrayz("litter","сміття");}
            else if (t == 126) {arrayz("controversial","суперечливий");}
            else if (t == 127) {arrayz("fooling around","дуріти");}
            else if (t == 128) {arrayz("persuade","переконувати");}
            else if (t == 129) {arrayz("calmly","спокійно");}
            else if (t == 130) {arrayz("bumped into","врізався");}
            else if (t == 131) {arrayz("almost","майже");}
            else if (t == 132) {arrayz("same as ever","так само як завжди");}
            else if (t == 133) {arrayz("get on with","порозумітися");}
            else if (t == 134) {arrayz("certainly","звичайно");}
            else if (t == 135) {arrayz("laziness","лінь");}
            else if (t == 136) {arrayz("complain","скаржатися");}
            else if (t == 137) {arrayz("district","район");}
            else if (t == 138) {arrayz("attend","відвідувати");}
            else if (t == 139) {arrayz("much in common","багато спільного");}
            else if (t == 140) {arrayz("common","поширений");}
            else if (t == 141) {arrayz("skip","пропустити");}
            else if (t == 142) {arrayz("current","поточний");}
            else if (t == 143) {arrayz("so far","досі, доти");}
            else if (t == 144) {arrayz("figure out","здогадатися");}
            else if (t == 145) {arrayz("rather","швидше (так або ні)");}
            else if (t == 146) {arrayz("requirement","вимога");}
            else if (t == 147) {arrayz("treated","лікували");}
            else if (t == 148) {arrayz("recently","нещодавно");}
            else if (t == 149) {arrayz("lately","останнім часом");}
            else if (t == 150) {arrayz("cruel","жорстокий");}
            else if (t == 151) {arrayz("device","пристрій");}
            else if (t == 152) {arrayz("pain","біль");}
            else if (t == 153) {arrayz("thrill","коливання (трепет)");}
            else if (t == 154) {arrayz("senses","почуття");}
            else if (t == 155) {arrayz("mouth","рот");}
            else if (t == 156) {arrayz("web","павутиння");}
            else if (t == 157) {arrayz("skin","шкіра");}
            else if (t == 158) {arrayz("wet","вологий, мокрий");}
            else if (t == 159) {arrayz("lace","шнурок (мережево)");}
            else if (t == 160) {arrayz("sweat","піт");}
            else if (t == 161) {arrayz("needle","голка");}
            else if (t == 162) {arrayz("pin","шпилька");}
            else if (t == 163) {arrayz("scream","кричати");}
            else if (t == 164) {arrayz("taste","смак");}
            else if (t == 165) {arrayz("for the time being","поки що, тимчасово");}
            else if (t == 166) {arrayz("upset","засмучений");}
            else if (t == 167) {arrayz("assigned","призначений");}
            else if (t == 168) {arrayz("clearly","ясно");}
            else if (t == 169) {arrayz("behave","поводитися");}
            else if (t == 170) {arrayz("silly","дурний");}
            else if (t == 171) {arrayz("excited","схвильований");}
            else if (t == 172) {arrayz("accept","прийняти");}
            else if (t == 173) {arrayz("independent","незалежний");}
            else if (t == 174) {arrayz("appearance","зовнішній вигляд");}
            else if (t == 175) {arrayz("mention","згадка");}
            else if (t == 176) {arrayz("relationship","відносини");}
            else if (t == 177) {arrayz("indeed","дійсно");}
            else if (t == 179) {arrayz("strike out","викреслити");}
            else if (t == 180) {arrayz("appreciate","цінувати");}
            else if (t == 181) {arrayz("attempt","спроба");}
    }}
    public static void dictionar(){
        Random words = new Random();
        for (int i = 0; i < 140; i++){
            int t = words.nextInt(81,182);
            //System.out.println(t);
            if (t == 0){arraz("glimpse","уявлення");}
            else if (t == 1) {arraz("deal with","розбиратися");}
            else if (t == 2) {arraz("opportunity","можливість");}
            else if (t == 3) {arraz("store","зберігати");}
            else if (t == 4) {arraz("upvote","голосувати за");}
            else if (t == 5) {arraz("accommodate","розмістити");}
            else if (t == 6) {arraz("aid","допомогати");}
            else if (t == 7) {arraz("adopt","приймати");}
            else if (t == 8) {arraz("gain","виграш");}
            else if (t == 9) {arraz("increase","збільшувати");}
            else if (t == 10) {arraz("essential","істотний");}
            else if (t == 11) {arraz("instead","замість");}
            else if (t == 12) {arraz("divide","ділити");}
            else if (t == 13) {arraz("tribe","плем'я");}
            else if (t == 14) {arraz("clash","зіткнення");}
            else if (t == 15) {arraz("comprehension","розуміння");}
            else if (t == 16) {arraz("stuck","зупинитися");}
            else if (t == 17) {arraz("confident","впевнений");}
            else if (t == 18) {arraz("request","запит");}
            else if (t == 19) {arraz("generalized","узагальнений");}
            else if (t == 20) {arraz("impact","вплив");}
            else if (t == 21) {arraz("unusable","невикористовуваємий");}
            else if (t == 22) {arraz("impractical","недоцільно");}
            else if (t == 23) {arraz("affiant","упорядник");}
            else if (t == 24) {arraz("compiler","упорядник");}
            else if (t == 25) {arraz("introduce","представляти");}
            else if (t == 26) {arraz("except","за виключенням");}
            else if (t == 27) {arraz("expect","очікувати");}
            else if (t == 28) {arraz("achieve","досягти");}
            else if (t == 29) {arraz("consider","розглянути");}
            else if (t == 30) {arraz("definitely","безумовно");}
            else if (t == 31) {arraz("according","відповідно");}
            else if (t == 32) {arraz("corresponding","відповідний");}
            else if (t == 33) {arraz("matches","відповідає");}
            else if (t == 34) {arraz("determine","визначення");}
            else if (t == 35) {arraz("variable","змінна");}
            else if (t == 36) {arraz("specify","вказати");}
            else if (t == 37) {arraz("receive","отримувати");}
            else if (t == 38) {arraz("sequence","послідовність");}
            else if (t == 39) {arraz("compared","в порівнянні");}
            else if (t == 40) {arraz("search","пошук");}
            else if (t == 41) {arraz("mutable","мінливий");}
            else if (t == 42) {arraz("unless","хіба що");}
            else if (t == 43) {arraz("otherwise","інакше");}
            else if (t == 44) {arraz("thrown","кинутий");}
            else if (t == 45) {arraz("pair","пара");}
            else if (t == 46) {arraz("addition","додавати");}
            else if (t == 47) {arraz("application","додаток");}
            else if (t == 48) {arraz("offer","пропонувати, спроба");}
            else if (t == 49) {arraz("advice","порада");}
            else if (t == 50) {arraz("allow","дозволяти");}
            else if (t == 51) {arraz("accomplish","виконувати");}
            else if (t == 52) {arraz("suppress","заборонити");}
            else if (t == 53) {arraz("empty","порожній");}
            else if (t == 54) {arraz("scratch","написаний");}
            else if (t == 55) {arraz("parse","розібрати");}
            else if (t == 56) {arraz("stain","пятно");}
            else if (t == 57) {arraz("available","доступний");}
            else if (t == 58) {arraz("regex","регулярний вираз");}
            else if (t == 59) {arraz("counter","лічільник");}
            else if (t == 60) {arraz("consider","розглянути");}
            else if (t == 61) {arraz("available","доступний");}
            else if (t == 62) {arraz("sequence","послідовність");}
            else if (t == 63) {arraz("receive","отримувати");}
            else if (t == 64) {arraz("specify","вказати");}
            else if (t == 65) {arraz("determine","визначення");}
            else if (t == 66) {arraz("consistent","послідовний");}
            else if (t == 67) {arraz("plenty","багато");}
            else if (t == 68) {arraz("afford","мати можливість");}
            else if (t == 69) {arraz("adore","обожнюю");}
            else if (t == 70) {arraz("jealous","заздрістний");}
            else if (t == 71) {arraz("envy","заздрість");}
            else if (t == 72) {arraz("letting","дозволяти");}
            else if (t == 73) {arraz("observation","спостереження");}
            else if (t == 74) {arraz("simple","простий");}
            else if (t == 75) {arraz("incredible","неймовірно");}
            else if (t == 76) {arraz("wicked","злий");}
            else if (t == 77) {arraz("amazing","дивовижний");}
            else if (t == 78) {arraz("workout","тренування");}
            else if (t == 79) {arraz("assessment","оцінка");}
            else if (t == 80) {arraz("sign","знак");}
            else if (t == 81) {arraz("work it out","зроби це");}
            else if (t == 82) {arraz("response","відповідь");}
            else if (t == 83) {arraz("throughput","всюди");}
            else if (t == 84) {arraz("disable","відключити");}
            else if (t == 85) {arraz("introduction","вступ");}
            else if (t == 86) {arraz("freshers","першокурсник");}
            else if (t == 87) {arraz("introduced","введено");}
            else if (t == 88) {arraz("bored","нудно");}
            else if (t == 89) {arraz("frequent","частий");}
            else if (t == 90) {arraz("cave","печера");}
            else if (t == 91) {arraz("torch","ліхтар");}
            else if (t == 92) {arraz("trap","пастка");}
            else if (t == 93) {arraz("occasionally","час від часу");}
            else if (t == 94) {arraz("belong","належати");}
            else if (t == 95) {arraz("brackets","дужки");}
            else if (t == 96) {arraz("lonely","самотній");}
            else if (t == 97) {arraz("charity","благодійність");}
            else if (t == 98) {arraz("gang","банда");}
            else if (t == 99) {arraz("redundant","надлишковий");}
            else if (t == 100) {arraz("attempt","спроба");}
            else if (t == 101) {arraz("highlight","підсвічувати");}
            else if (t == 102) {arraz("exactly","точно");}
            else if (t == 103) {arraz("contribute","вносити, сприяти");}
            else if (t == 104) {arraz("guess","вгадати");}
            else if (t == 105) {arraz("specify","вказати");}
            else if (t == 106) {arraz("expend","витрачати");}
            else if (t == 107) {arraz("contain","містять");}
            else if (t == 108) {arraz("expand","поширювати");}
            else if (t == 109) {arraz("statement","заява");}
            else if (t == 110) {arraz("whole","ціле");}
            else if (t == 111) {arraz("expression","вираз");}
            else if (t == 112) {arraz("noisy","галасливий");}
            else if (t == 113) {arraz("noise","шум");}
            else if (t == 114) {arraz("tracksuit","спортивний костюм");}
            else if (t == 115) {arraz("brand new","новинка");}
            else if (t == 116) {arraz("trainers","кросівки");}
            else if (t == 117) {arraz("hurry","поспішати");}
            else if (t == 118) {arraz("quiet","спокійно");}
            else if (t == 119) {arraz("quiet the opposite","зовсім навпаки");}
            else if (t == 120) {arraz("quite","цілком");}
            else if (t == 121) {arraz("harmless","нешкідливий");}
            else if (t == 122) {arraz("hang around","бродити навкруги");}
            else if (t == 123) {arraz("tired","втомитися");}
            else if (t == 124) {arraz("putting up with","терпіти");}
            else if (t == 125) {arraz("litter","сміття");}
            else if (t == 126) {arraz("controversial","суперечливий");}
            else if (t == 127) {arraz("fooling around","дуріти");}
            else if (t == 128) {arraz("persuade","переконувати");}
            else if (t == 129) {arraz("calmly","спокійно");}
            else if (t == 130) {arraz("bumped into","врізався");}
            else if (t == 131) {arraz("almost","майже");}
            else if (t == 132) {arraz("same as ever","так само як завжди");}
            else if (t == 133) {arraz("get on with","порозумітися");}
            else if (t == 134) {arraz("certainly","звичайно");}
            else if (t == 135) {arraz("laziness","лінь");}
            else if (t == 136) {arraz("complain","скаржатися");}
            else if (t == 137) {arraz("district","район");}
            else if (t == 138) {arraz("attend","відвідувати");}
            else if (t == 139) {arraz("much in common","багато спільного");}
            else if (t == 140) {arraz("common","поширений");}
            else if (t == 141) {arraz("skip","пропустити");}
            else if (t == 142) {arraz("current","поточний");}
            else if (t == 143) {arraz("so far","досі, доти");}
            else if (t == 144) {arraz("figure out","здогадатися");}
            else if (t == 145) {arraz("rather","швидше (так або ні)");}
            else if (t == 146) {arraz("requirement","вимога");}
            else if (t == 147) {arraz("treated","лікували");}
            else if (t == 148) {arraz("recently","нещодавно");}
            else if (t == 149) {arraz("lately","останнім часом");}
            else if (t == 150) {arraz("cruel","жорстокий");}
            else if (t == 151) {arraz("device","пристрій");}
            else if (t == 152) {arraz("pain","біль");}
            else if (t == 153) {arraz("thrill","коливання (трепет)");}
            else if (t == 154) {arraz("senses","почуття");}
            else if (t == 155) {arraz("mouth","рот");}
            else if (t == 156) {arraz("web","павутиння");}
            else if (t == 157) {arraz("skin","шкіра");}
            else if (t == 158) {arraz("wet","вологий, мокрий");}
            else if (t == 159) {arraz("lace","шнурок (мережево)");}
            else if (t == 160) {arraz("sweat","піт");}
            else if (t == 161) {arraz("needle","голка");}
            else if (t == 162) {arraz("pin","шпилька");}
            else if (t == 163) {arraz("scream","кричати");}
            else if (t == 164) {arraz("taste","смак");}
            else if (t == 165) {arraz("for the time being","поки що, тимчасово");}
            else if (t == 166) {arraz("upset","засмучений");}
            else if (t == 167) {arraz("assigned","призначений");}
            else if (t == 168) {arraz("clearly","ясно");}
            else if (t == 169) {arraz("behave","поводитися");}
            else if (t == 170) {arraz("silly","дурний");}
            else if (t == 171) {arraz("excited","схвильований");}
            else if (t == 172) {arraz("accept","прийняти");}
            else if (t == 173) {arraz("independent","незалежний");}
            else if (t == 174) {arraz("appearance","зовнішній вигляд");}
            else if (t == 175) {arraz("mention","згадка");}
            else if (t == 176) {arraz("relationship","відносини");}
            else if (t == 177) {arraz("indeed","дійсно");}
            else if (t == 179) {arraz("strike out","викреслити");}
            else if (t == 180) {arraz("appreciate","цінувати");}
            else if (t == 181) {arraz("attempt","спроба");}
        }}
    public static void arrayz(String a,String b){
        Scanner in = new Scanner(System.in);
        String word = a;
        while (!word.equals(b)) {
            System.out.print("\n" + "Translate " + a + " = ");
            word = in.nextLine();
            if (!word.equals(b)) {
                System.out.println(" You must know " + a +" is " + b);
            }}
        System.out.print("You win " + word + " is "+ a);
        String worda = b;
        while (!worda.equals(a)) {
            System.out.print("\n" + "Переведіть слово " + b + " = ");
            worda = in.nextLine();
            if (!worda.equals(a)) {
                System.out.println(" Ви маєте знати, що слолво " + b +" is " + a);
            }}
        System.out.print("You win слолво " + b + " " + worda + "\n");

    }
    public static void arraz(String a,String b){
        Scanner in = new Scanner(System.in);
        String worda = b;
        while (!worda.equals(a)) {
            System.out.print("\n" + "Переведіть слово " + b + " = ");
            worda = in.nextLine();
            if (!worda.equals(a)) {
                System.out.println(" Ви маєте знати, що слолво " + b +" is " + a);
            }}
        System.out.print("You win слолво " + b + " " + worda + "\n");
    }}


