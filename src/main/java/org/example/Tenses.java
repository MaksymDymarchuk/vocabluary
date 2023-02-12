package org.example;

import java.util.Scanner;

public class Tenses {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("If you want to learn теперішній час push:  1 ");
        System.out.println("If you want to learn минулий час push:  2 ");
        System.out.println("If you want to learn майбутній час push:  3 ");
        System.out.println("If you want to learn tootifrutti push:  4 ");
        int a = num.nextInt();
        switch (a) {
            case 1:
                teperishniy();
                break;
            case 2:
                mynule();
                break;
            case 3:
                maybutne();
                break;
            case 4:
                tootifrutti();
            break;
        }
    }
        public static void teperishniy() {
        Scanner str = new Scanner(System.in);
        String vyraz = "";
        while (!vyraz.equals("I am working")) {
            System.out.print("\n" + "Введіть переклад : Я працюю зараз : ");
            vyraz = str.nextLine();
            if (!vyraz.equals("I am working")) {
                System.out.println("Ви повинні знати : Я працюю зараз : I am working");
            }
        }
        System.out.print("Я працюю зараз : " + vyraz);
        String avyraz = "";
        while (!avyraz.equals("Where are you working")) {
            System.out.print("\n" + "Введіть переклад : Де ти зараз працюєш : ");
            avyraz = str.nextLine();
            if (!avyraz.equals("Where are you working")) {
                System.out.println("Ви повинні знати : Де ти зараз працюєш : Where are you working");
            }
        }
        System.out.print("Він зараз працює : " + avyraz);
        String bvyraz = "";
        while (!bvyraz.equals("He is working")) {
            System.out.print("\n" + "Введіть переклад : Він зараз працює : ");
            bvyraz = str.nextLine();
            if (!bvyraz.equals("He is working")) {
                System.out.println("Ви повинні знати : Він зараз працює : He is working");
            }
        }
        System.out.print("Він зараз працює : " + bvyraz);
        String cvyraz = "";
        while (!cvyraz.equals("She has been here")) {
            System.out.print("\n" + "Введіть переклад : Вона тількі що була тут : ");
            cvyraz = str.nextLine();
            if (!cvyraz.equals("She has been here")) {
                System.out.println("Ви повинні знати : Вона тількі що була тут : She has been here");
            }
        }
        System.out.print("Вона тількі що була тут : " + cvyraz);
        String dvyraz = "";
        while (!dvyraz.equals("Where have they been?")) {
            System.out.print("\n" + "Введіть переклад : Де вони тількі що були? : ");
            dvyraz = str.nextLine();
            if (!dvyraz.equals("Where have they been?")) {
                System.out.println("Ви повинні знати : Де вони тількі що були? : Where have they been?");
            }
        }
        System.out.print("Де вони тількі що були? : " + dvyraz);
        String evyraz = "";
        while (!evyraz.equals("I have never been to Spain")) {
            System.out.print("\n" + "Введіть переклад : Я ніколи ще не був в Іспанії : ");
            evyraz = str.nextLine();
            if (!evyraz.equals("I have never been to Spain")) {
                System.out.println("Ви повинні знати : Я ніколи ще не був в Іспанії : I have never been to Spain");
            }
        }
        System.out.print("Я ніколи ще не був в Іспанії : " + evyraz);
        String fvyraz = "";
        while (!fvyraz.equals("She has been here for an hour")) {
            System.out.print("\n" + "Введіть переклад : Вона тут вже годину : ");
            fvyraz = str.nextLine();
            if (!fvyraz.equals("She has been here for an hour")) {
                System.out.println("Ви повинні знати : Вона тут вже годину : She has been here for an hour");
            }
        }
        System.out.print("Вона тут вже годину : " + fvyraz);
        String jvyraz = "";
        while (!jvyraz.equals("He has been here since 5 o'clock")) {
            System.out.print("\n" + "Введіть переклад : Він тут вже з п'ятої години : ");
            jvyraz = str.nextLine();
            if (!jvyraz.equals("He has been here since 5 o'clock")) {
                System.out.println("Ви повинні знати : Він тут вже з п'ятої години : He has been here since 5 o'clock");
            }
        }
        System.out.print("Він тут вже з п'ятої години : " + jvyraz);
        String gvyraz = "";
        while (!gvyraz.equals("He has been here since 5 o'clock")) {
            System.out.print("\n" + "Введіть переклад : Він тут вже з п'ятої години : ");
            gvyraz = str.nextLine();
            if (!gvyraz.equals("He has been here since 5 o'clock")) {
                System.out.println("Ви повинні знати : Він тут вже з п'ятої години : He has been here since 5 o'clock");
            }
        }
        System.out.print("Він тут вже з п'ятої години : " + gvyraz);
        String ivyraz = "";
        while (!ivyraz.equals("She is there")) {
            System.out.print("\n" + "Введіть переклад : Вона там : ");
            ivyraz = str.nextLine();
            if (!ivyraz.equals("She is there")) {
                System.out.println("Ви повинні знати : Він тут вже з п'ятої години : She is there");
            }
        }
        System.out.print("Вона там вже п'ять днів: " + ivyraz);
        String lvyraz = "";
        while (!lvyraz.equals("She has been there for 5 days")) {
            System.out.print("\n" + "Введіть переклад : Вона там вже п'ять днів : ");
            lvyraz = str.nextLine();
            if (!lvyraz.equals("She has been there for 5 days")) {
                System.out.println("Ви повинні знати : Вона там вже п'ять днів : She has been there for 5 days");
            }
        }
        System.out.print("Вона там вже п'ять днів : " + lvyraz);
        String mvyraz = "";
        while (!mvyraz.equals("She has been there")) {
            System.out.print("\n" + "Введіть переклад : Вона тільки що побувала там : ");
            mvyraz = str.nextLine();
            if (!mvyraz.equals("She has been there")) {
                System.out.println("Ви повинні знати : Вона тільки що побувала там  : She has been there");
            }
        }
        System.out.print("Вона тільки що побувала там  : " + mvyraz);
        String nvyraz = "";
        while (!nvyraz.equals("We are still in Italy")) {
            System.out.print("\n" + "Введіть переклад : Ми все ще в Італії : ");
            nvyraz = str.nextLine();
            if (!nvyraz.equals("We are still in Italy")) {
                System.out.println("Ви повинні знати : Ми все ще в Італії : We are still in Italy");
            }
        }
        System.out.print("Ми все ще в Італії : " + nvyraz);
        String ovyraz = "";
        while (!ovyraz.equals("He has been in Italy since May")) {
            System.out.print("\n" + "Введіть переклад : Він в Італії з травня : ");
            ovyraz = str.nextLine();
            if (!ovyraz.equals("He has been in Italy since May")) {
                System.out.println("Ви повинні знати : Він в Італії з травня : He has been in Italy since May");
            }
        }
        System.out.print("Він в Італії з травня : " + ovyraz);
        String pvyraz = "";
        while (!pvyraz.equals("I have been in Italy for 2 months")) {
            System.out.print("\n" + "Введіть переклад : Я в Італії вже два місяці : ");
            pvyraz = str.nextLine();
            if (!pvyraz.equals("I have been in Italy for 2 months")) {
                System.out.println("Ви повинні знати : Я в Італії вже два місяці : I have been in Italy for 2 months");
            }
        }
        System.out.print("Я в Італії вже два місяці : " + pvyraz);
        String rvyraz = "";
        while (!rvyraz.equals("They have been ill since Monday")) {
            System.out.print("\n" + "Введіть переклад : Вони хворіють з понеділка : ");
            rvyraz = str.nextLine();
            if (!rvyraz.equals("They have been ill since Monday")) {
                System.out.println("Ви повинні знати : Вони хворіють з понеділка : They have been ill since Monday");
            }
        }
        System.out.print("Вони хворіють з понеділка : " + rvyraz);
        String svyraz = "";
        while (!svyraz.equals("They have been busy for 3 hours")) {
            System.out.print("\n" + "Введіть переклад : Вони зайняті вже три години : ");
            svyraz = str.nextLine();
            if (!svyraz.equals("They have been busy for 3 hours")) {
                System.out.println("Ви повинні знати : Вони зайняті вже три години : They have been busy for 3 hours");
            }
        }
        System.out.print("Вони зайняті вже три години : " + svyraz);
        String tvyraz = "";
        while (!tvyraz.equals("I have not been here yet")) {
            System.out.print("\n" + "Введіть переклад : Я ще не був тут : ");
            tvyraz = str.nextLine();
            if (!tvyraz.equals("I have not been here yet")) {
                System.out.println("Ви повинні знати : Я ще не був тут : I have not been here yet");
            }
        }
        System.out.print("Я ще не був тут : " + tvyraz);
        String vvyraz = "";
        while (!vvyraz.equals("How long have you been here?")) {
            System.out.print("\n" + "Введіть переклад : Скільки ти вже тут : ");
            vvyraz = str.nextLine();
            if (!vvyraz.equals("How long have you been here?")) {
                System.out.println("Ви повинні знати : Скільки ти вже тут : How long have you been here?");
            }
        }
        System.out.print("Скільки ти вже тут : " + vvyraz);
        String wvyraz = "";
        while (!wvyraz.equals("How long has she been in Germany?")) {
            System.out.print("\n" + "Введіть переклад : Скільки вона вже в Німеччині : ");
            wvyraz = str.nextLine();
            if (!wvyraz.equals("How long has she been in Germany?")) {
                System.out.println("Ви повинні знати : Скільки вона вже в Німеччині : How long has she been in Germany?");
            }
        }
        System.out.print("Скільки вона вже в Німеччині : " + wvyraz);
        String xvyraz = "";
        while (!xvyraz.equals("How long have you been here?")) {
            System.out.print("\n" + "Введіть переклад : Скільки ти вже тут? : ");
            xvyraz = str.nextLine();
            if (!xvyraz.equals("How long have you been here?")) {
                System.out.println("Ви повинні знати : Скільки ти вже тут?  : How long have you been here?");
            }
        }
        System.out.print("Скільки ти вже тут?  : " + xvyraz);
        String yvyraz = "";
        while (!yvyraz.equals("I am working")) {
            System.out.print("\n" + "Введіть переклад : Я працюю (зараз): ");
            yvyraz = str.nextLine();
            if (!yvyraz.equals("I am working")) {
                System.out.println("Ви повинні знати : Я працюю (зараз): I am working");
            }
        }
        System.out.print("Я працюю (зараз): " + yvyraz);
        String zvyraz = "";
        while (!zvyraz.equals("I have been working for 2 days")) {
            System.out.print("\n" + "Введіть переклад : Я працюю на протязі двох днів: ");
            zvyraz = str.nextLine();
            if (!zvyraz.equals("I have been working for 2 days")) {
                System.out.println("Ви повинні знати : Я працюю на протязі двох днів : I have been working for 2 days");
            }
        }
        System.out.print("Я працюю на протязі двох днів: " + zvyraz);
        String uvyraz = "";
        while (!uvyraz.equals("Have you been there?")) {
            System.out.print("\n" + "Введіть переклад : Ти там вже був? : ");
            uvyraz = str.nextLine();
            if (!uvyraz.equals("Have you been there?")){
                System.out.println("Ви повинні знати : Ти там вже був? : Have you been there?");
            }
        }
        System.out.print("Ти там вже був? : " + uvyraz);
        String qvyraz = "";
        while (!qvyraz.equals("It is done every day")) {
            System.out.print("\n" + "Введіть переклад : Це роблять кожного дня : ");
            qvyraz = str.nextLine();
            if (!qvyraz.equals("It is done every day")){
                System.out.println("Ви повинні знати : Це роблять кожного дня : It is done every day");
            }
        }
        System.out.print("Це роблять кожного дня : " + qvyraz);
        String vvvyraz = "";
        while (!vvvyraz.equals("It has been done")) {
            System.out.print("\n" + "Введіть переклад : Це вже зроблено : ");
            vvvyraz = str.nextLine();
            if (!vvvyraz.equals("It has been done")){
                System.out.println("Ви повинні знати : Це вже зроблено : It has been done");
            }}
            String vvvvyraz = "";
            while (!vvvvyraz.equals("I have been here for the second time")) {
                System.out.print("\n" + "Введіть переклад : Я тут вже другий раз : ");
                vvvvyraz = str.nextLine();
                if (!vvvvyraz.equals("I have been here for the second time")){
                    System.out.println("Ви повинні знати : Я тут вже другий раз : I have been here for the second time");
                }

        System.out.print("Я тут вже другий раз : " + vvvvyraz);
        }}
        public static void mynule() {
        Scanner str = new Scanner(System.in);
        String vyraz = "";
        while (!vyraz.equals("I had been here before he won")) {
            System.out.print("\n" + "Введіть переклад : Я був тут до того, як він виграв : ");
            vyraz = str.nextLine();
            if (!vyraz.equals("I had been here before he won")) {
                System.out.println("Ви повинні знати : Я був тут до того, як він виграв : I had been here before he won");
            }
        }
        System.out.print("Я був тут до того, як він виграв : " + vyraz);
        String avyraz = "";
        while (!avyraz.equals("I had been here by 5")) {
            System.out.print("\n" + "Введіть переклад : Я був тут до 5 : ");
            avyraz = str.nextLine();
            if (!avyraz.equals("I had been here by 5")) {
                System.out.println("Ви повинні знати : Я був тут до 5 : I had been here by 5");
            }
        }
        System.out.print("Я був тут до 5 : " + avyraz);
        String bvyraz = "";
        while (!bvyraz.equals("She had been there until they called")) {
            System.out.print("\n" + "Введіть переклад : Вона була там до того, як вони телефонували : ");
            bvyraz = str.nextLine();
            if (!bvyraz.equals("She had been there until they called")) {
                System.out.println("Ви повинні знати : Вона була там до того, як вони телефонували : She had been there until they called");
            }
        }
        System.out.print("Вона була там до того, як вони телефонували : " + bvyraz);
        String cvyraz = "";
        while (!cvyraz.equals("I was there at 7")) {
        System.out.print("\n" + "Введіть переклад : Я був там в 7 : ");
            cvyraz = str.nextLine();
        if (!cvyraz.equals("I was there at 7")) {
            System.out.println("Ви повинні знати : Я був там в 7 : I was there at 7");
        }
        }
        System.out.print("Я був там в 7 : " + cvyraz);
        String dvyraz = "";
        while (!dvyraz.equals("I had been there by 7")) {
            System.out.print("\n" + "Введіть переклад : Я був там ще до 7 : ");
            dvyraz = str.nextLine();
            if (!dvyraz.equals("I had been there by 7")) {
                System.out.println("Ви повинні знати : Я був там ще до : I had been there by 7");
            }
        }
        System.out.print("Я був там ще до : " + dvyraz);
        String evyraz = "";
        while (!evyraz.equals("She was there at 7")) {
            System.out.print("\n" + "Введіть переклад : Вона була там о 7 : ");
            evyraz = str.nextLine();
            if (!evyraz.equals("She was there at 7")){
                System.out.println("Ви повинні знати : Вона була там о 7 : She was there at 7");
            }
        }
        System.out.print("Вона була там о 7 : " + evyraz);
        String fvyraz = "";
        while (!fvyraz.equals("She had been there by 7")) {
            System.out.print("\n" + "Введіть переклад : Вона була там до 7 : ");
            fvyraz = str.nextLine();
            if (!fvyraz.equals("She had been there by 7")){
                System.out.println("Ви повинні знати : Вона була там до 7 : She had been there by 7");
            }
        }
        System.out.print("Вона була там до 7 : " + fvyraz);
        String gvyraz = "";
        while (!gvyraz.equals("She had been there for 2 days when we came")) {
            System.out.print("\n" + "Введіть переклад : Вона була там вже два дні, коли ми приїхали : ");
            gvyraz = str.nextLine();
            if (!gvyraz.equals("She had been there for 2 days when we came")){
                System.out.println("Ви повинні знати : Вона була там вже два дні, коли ми приїхали : She had been there for 2 days when we came");
            }
        }
        System.out.print("Вона була там вже два дні, коли ми приїхали : " + gvyraz);
        String ivyraz = "";
        while (!ivyraz.equals("He had been there long before I came")) {
            System.out.print("\n" + "Введіть переклад : Він був там за довго до того, коли я прийшов : ");
            ivyraz = str.nextLine();
            if (!ivyraz.equals("He had been there long before I came")){
                System.out.println("Ви повинні знати : Він був там за довго до того, коли я прийшов : He had been there long before I came");
            }
        }
        System.out.print("Він був там за довго до того, коли я прийшов : " + ivyraz);
        String mvyraz = "";
        while (!mvyraz.equals("I was really busy yesterday")) {
            System.out.print("\n" + "Введіть переклад : Я був сильно зайнятий вчора : ");
            mvyraz = str.nextLine();
            if (!mvyraz.equals("I was really busy yesterday")){
                System.out.println("Ви повинні знати : Я був сильно зайнятий вчора : I was really busy yesterday");
            }
        }
        System.out.print("Я був сильно зайнятий вчора : " + mvyraz);
        String nvyraz = "";
        while (!nvyraz.equals("How long had you been here before she came")) {
            System.out.print("\n" + "Введіть переклад : Як довго ти був тут до того як вона приїхала : ");
            nvyraz = str.nextLine();
            if (!nvyraz.equals("How long had you been here before she came")){
                System.out.println("Ви повинні знати : Як довго ти був тут до того як вона приїхала : How long had you been here before she came");
            }
        }
        System.out.print("Як довго ти був тут до того як вона приїхала : " + nvyraz);
        String ovyraz = "";
        while (!ovyraz.equals("We had been there for 2 hours when he called")) {
            System.out.print("\n" + "Введіть переклад : Ми були там вже дві години, коли він затедефонував : ");
            ovyraz = str.nextLine();
            if (!ovyraz.equals("We had been there for 2 hours when he called")){
                System.out.println("Ви повинні знати : Ми були там вже дві години, коли він затедефонував : We had been there for 2 hours when he called");
            }
        }
        System.out.print("Ми були там вже дві години, коли він затедефонував : " + ovyraz);
        String pvyraz = "";
        while (!pvyraz.equals("We were in Rome last weekend")) {
            System.out.print("\n" + "Введіть переклад : Ми були були в Римі на бувших вихідних : ");
            pvyraz = str.nextLine();
            if (!pvyraz.equals("We were in Rome last weekend")){
                System.out.println("Ви повинні знати : Ми були були в Римі на бувших вихідних : We were in Rome last weekend");
            }
        }
        System.out.print("Ми були були в Римі на бувших вихідних : " + pvyraz);
        String rvyraz = "";
        while (!rvyraz.equals("When were you there?")) {
            System.out.print("\n" + "Введіть переклад : Коли ти там був? : ");
            rvyraz = str.nextLine();
            if (!rvyraz.equals("When were you there?")){
                System.out.println("Ви повинні знати : Коли ти там був? : When were you there?");
            }
        }
        System.out.print("Коли ти там був? : " + rvyraz);
        String svyraz = "";
        while (!svyraz.equals("I was working at 5 o'clock")) {
            System.out.print("\n" + "Введіть переклад : Я саме працював о п'ятій : ");
            svyraz = str.nextLine();
            if (!svyraz.equals("I was working at 5 o'clock")){
                System.out.println("Ви повинні знати : Я саме працював о п'ятій  : I was working at 5 o'clock");
            }
        }
        System.out.print("Я саме працював о п'ятій : " + svyraz);
        String xvyraz = "";
        while (!xvyraz.equals("I had been working for 3 days when he came")) {
            System.out.print("\n" + "Введіть переклад : Я саме працював на протязі трьох днів коли він приїхав : ");
            xvyraz = str.nextLine();
            if (!xvyraz.equals("I had been working for 3 days when he came")){
                System.out.println("Ви повинні знати : Я саме  працював на протязі трьох днів коли він приїхав  : I had been working for 3 days when he came");
            }
        }
        System.out.print("Я саме працював на протязі трьох днів коли він приїхав : " + xvyraz);
        String yvyraz = "";
        while (!yvyraz.equals("It was done yesterday")) {
            System.out.print("\n" + "Введіть переклад : Це було зроблено вчора : ");
            yvyraz = str.nextLine();
            if (!yvyraz.equals("It was done yesterday")){
                System.out.println("Ви повинні знати : Це було зроблено вчора : It was done yesterday");
            }
        }
        System.out.print("Це було зроблено вчора : " + yvyraz);

        }
        public static void maybutne() {
            Scanner str = new Scanner(System.in);
            String vyraz = "";
            while (!vyraz.equals("Tomorrow we will have been married for thirty years")) {
                System.out.print("\n" + "Введіть переклад : Завтра буде 30 років, як ми одружені : ");
                vyraz = str.nextLine();
                if (!vyraz.equals("Tomorrow we will have been married for thirty years")) {
                    System.out.println("Ви повинні знати : Завтра буде 30 років, як ми одружені : Tomorrow we will have been married for thirty years");
                }
            }
            System.out.print("Завтра буде 30 років, як ми одружені : " + vyraz);
            String avyraz = "";
            while (!avyraz.equals("She will have been in Paris for half a year by the end of the week")) {
                System.out.print("\n" + "Введіть переклад : В кінці тижня буде півроку, як вона в Парижі  : ");
                avyraz = str.nextLine();
                if (!avyraz.equals("She will have been in Paris for half a year by the end of the week")) {
                    System.out.println("Ви повинні знати : В кінці тижня буде півроку, як вона в Парижі : She will have been in Paris for half a year by the end of the week");
                }
            }
            System.out.print("В кінці тижня буде півроку, як вона в Парижі : " + avyraz);
            String bvyraz = "";
            while (!bvyraz.equals("It will have been done by september")) {
                System.out.print("\n" + "Введіть переклад : Це буде зроблено до вересня  : ");
                bvyraz = str.nextLine();
                if (!bvyraz.equals("It will have been done by september")) {
                    System.out.println("Ви повинні знати : Це буде зроблено до вересня : It will have been done by september");
                }
            }
            System.out.print("Це буде зроблено до вересня : " + bvyraz);
            String cvyraz = "";
            while (!cvyraz.equals("The car will have been fixed by tuesday")) {
                System.out.print("\n" + "Введіть переклад : Машину відремонтують до вівторка  : ");
                cvyraz = str.nextLine();
                if (!cvyraz.equals("The car will have been fixed by tuesday")) {
                    System.out.println("Ви повинні знати : Машину відремонтують до вівторка : The car will have been fixed by tuesday");
                }
            }
            System.out.print("Машину відремонтують до вівторка : " + cvyraz);
            String dvyraz = "";
            while (!dvyraz.equals("I will be there at 7")) {
                System.out.print("\n" + "Введіть переклад : Я буду там в 7  : ");
                dvyraz = str.nextLine();
                if (!dvyraz.equals("I will be there at 7")) {
                    System.out.println("Ви повинні знати : Я буду там в 7 : I will be there at 7");
                }
            }
            System.out.print("Я буду там до 7 : " + dvyraz);
            String evyraz = "";
            while (!evyraz.equals("I will be there by 7")) {
                System.out.print("\n" + "Введіть переклад : Я буду там до 7  : ");
                evyraz = str.nextLine();
                if (!evyraz.equals("I will be there by 7")) {
                    System.out.println("Ви повинні знати : Я буду там до 7 : I will be there by 7");
                }
            }
            System.out.print("Я буду там до 7 : " + evyraz);
            String fvyraz = "";
            while (!fvyraz.equals("I will have been in Paris for 2 month by tomorrow")) {
                System.out.print("\n" + "Введіть переклад : Завтра буде два місяці, як я в Парижі : ");
                fvyraz = str.nextLine();
                if (!fvyraz.equals("I will have been in Paris for 2 months by tomorrow")) {
                    System.out.println("Ви повинні знати : Завтра буде два місяці, як я в Парижі  : I will have been in Paris for 2 month by tomorrow");
                }
            }
            System.out.print("Завтра буде два місяці, як я в Парижі  : " + fvyraz);
            String gvyraz = "";
            while (!gvyraz.equals("She will be there at 7")) {
                System.out.print("\n" + "Введіть переклад : Вона буде там о 7 : ");
                gvyraz = str.nextLine();
                if (!gvyraz.equals("She will be there at 7")) {
                    System.out.println("Ви повинні знати : Вона буде там о 7  : She will be there at 7");
                }
            }
            System.out.print("Вона буде там о 7 : " + gvyraz);
            String hvyraz = "";
            while (!hvyraz.equals("She will be there by 7")) {
                System.out.print("\n" + "Введіть переклад : Вона буде там до 7 : ");
                hvyraz = str.nextLine();
                if (!hvyraz.equals("She will be there by 7")) {
                    System.out.println("Ви повинні знати : Вона буде там до 7  : She will be there by 7");
                }
            }
            System.out.print("Вона буде там до 7 : " + hvyraz);
            String jvyraz = "";
            while (!jvyraz.equals("She will have been woken up by 7")) {
                System.out.print("\n" + "Введіть переклад : Вона буде розбужена до 7 : ");
                jvyraz = str.nextLine();
                if (!jvyraz.equals("She will have been woken up by 7")) {
                    System.out.println("Ви повинні знати : Вона буде розбужена до 7   : She will have been woken up by 7");
                }
            }
            System.out.print("Вона буде розбужена до 7 : " + jvyraz);
            String ivyraz = "";
            while (!ivyraz.equals("She will have been met by the evening")) {
                System.out.print("\n" + "Введіть переклад : Її зустрінуть до вечора : ");
                ivyraz = str.nextLine();
                if (!ivyraz.equals("She will have been met by the evening")) {
                    System.out.println("Ви повинні знати : Її зустрінуть до вечора : She will have been met by the evening");
                }
            }
            System.out.print("Її зустрінуть до вечора : " + ivyraz);
            String lvyraz = "";
            while (!lvyraz.equals("She will have been chosen by the end of the week")) {
                System.out.print("\n" + "Введіть переклад : Її оберуть до кінця тижня : ");
                lvyraz = str.nextLine();
                if (!lvyraz.equals("She will have been chosen by the end of the week")) {
                    System.out.println("Ви повинні знати : Її оберуть до кінця тижня : She will have been chosen by the end of the week");
                }
            }
            System.out.print("Її оберуть до кінця тижня : " + lvyraz);
            String mvyraz = "";
            while (!mvyraz.equals("I will be on Saturday")) {
                System.out.print("\n" + "Введіть переклад : Я прийду в суботу : ");
                mvyraz = str.nextLine();
                if (!mvyraz.equals("I will be on Saturday")) {
                    System.out.println("Ви повинні знати : Я прийду в суботу : I will be on Saturday");
                }
            }
            System.out.print("Я прийду в суботу : " + mvyraz);
            String nvyraz = "";
            while (!nvyraz.equals("He will be here by Friday")) {
                System.out.print("\n" + "Введіть переклад : Він буде ще до п'ятниці : ");
                nvyraz = str.nextLine();
                if (!nvyraz.equals("He will be here by Friday")) {
                    System.out.println("Ви повинні знати : Він буде ще до п'ятниці : He will be here by Friday");
                }
            }
            System.out.print("Він буде ще до п'ятниці : " + nvyraz);
            String ovyraz = "";
            while (!ovyraz.equals("It will have been done by October")) {
                System.out.print("\n" + "Введіть переклад : Це буде зроблено до жовтня : ");
                ovyraz = str.nextLine();
                if (!ovyraz.equals("It will have been done by October")) {
                    System.out.println("Ви повинні знати : Це буде зроблено до жовтня : It will have been done by October");
                }
            }
            System.out.print("Це буде зроблено до жовтня : " + ovyraz);
            String pvyraz = "";
            while (!pvyraz.equals("It will be done in October")) {
                System.out.print("\n" + "Введіть переклад : Це зроблять в жовтні : ");
                pvyraz = str.nextLine();
                if (!pvyraz.equals("It will be done in October")) {
                    System.out.println("Ви повинні знати : Це зроблять в жовтні : It will be done in October");
                }
            }
            System.out.print("Це зроблять в жовтні : " + pvyraz);
            String rvyraz = "";
            while (!rvyraz.equals("It will have been bought by October")) {
                System.out.print("\n" + "Введіть переклад : Це куплять до жовтня : ");
                rvyraz = str.nextLine();
                if (!rvyraz.equals("It will have been bought by October")) {
                    System.out.println("Ви повинні знати : Це куплять до жовтня : It will have been bought by October");
                }
            }
            System.out.print("Це куплять до жовтня : " + rvyraz);
            String svyraz = "";
            while (!svyraz.equals("I will not be here tomorrow")) {
                System.out.print("\n" + "Введіть переклад : Я не буду тут завтра : ");
                svyraz = str.nextLine();
                if (!svyraz.equals("I will not be here tomorrow")) {
                    System.out.println("Ви повинні знати : Я не буду тут завтра : I will not be here tomorrow");
                }
            }
            System.out.print("Я не буду тут завтра : " + svyraz);
            String vvyraz = "";
            while (!vvyraz.equals("She will be at home the day after tomorrow")) {
                System.out.print("\n" + "Введіть переклад : Вона буде вдома післязавтра : ");
                vvyraz = str.nextLine();
                if (!vvyraz.equals("She will be at home the day after tomorrow")) {
                    System.out.println("Ви повинні знати : Вона буде вдома післязавтра: She will be at home the day after tomorrow");
                }
            }
            System.out.print("Вона буде вдома післязавтра : " + vvyraz);
            String wvyraz = "";
            while (!wvyraz.equals("I will be at home by the evening")) {
                System.out.print("\n" + "Введіть переклад : Я буду вдома до вечора : ");
                wvyraz = str.nextLine();
                if (!wvyraz.equals("I will be at home by the evening")) {
                    System.out.println("Ви повинні знати : Я буду вдома до вечора : I will be at home by the evening");
                }
            }
            System.out.print("Я буду вдома до вечора : " + wvyraz);
            String xvyraz = "";
            while (!xvyraz.equals("I will be working at 3")) {
                System.out.print("\n" + "Введіть переклад : Я буду саме прцювати о 3 : ");
                xvyraz = str.nextLine();
                if (!xvyraz.equals("I will be working at 3")) {
                    System.out.println("Ви повинні знати : Я буду саме прцювати о 3 : I will be working at 3");
                }
            }
            System.out.print("Я буду саме прцювати о 3 : " + xvyraz);
            String yvyraz = "";
            while (!yvyraz.equals("Tomorrow I will have been working here for 3 years")) {
                System.out.print("\n" + "Введіть переклад : Завтра буде 3 роки як я прцюю тут : ");
                yvyraz = str.nextLine();
                if (!yvyraz.equals("Tomorrow I will have been working here for 3 years")) {
                    System.out.println("Ви повинні знати : Завтра буде 3 роки як я прцюю тут : Tomorrow I will have been working here for 3 years");
                }
            }
            System.out.print("Завтра буде 3 роки як я прцюю тут : " + yvyraz);
            String zvyraz = "";
            while (!zvyraz.equals("It will be done tomorrow")) {
                System.out.print("\n" + "Введіть переклад : Це буде зроблено завтра : ");
                zvyraz = str.nextLine();
                if (!zvyraz.equals("It will be done tomorrow")) {
                    System.out.println("Ви повинні знати : Це буде зроблено завтра : It will be done tomorrow");
                }
            }
            System.out.print("Це буде зроблено завтра : " + zvyraz);
            }
            public static void tootifrutti(){
                Scanner str = new Scanner(System.in);
                String vyraz = "";
                while (!vyraz.equals("I have been learning English for 3 days")) {
                    System.out.print("\n" + "Введіть переклад : Я вчу англійську три дні ");
                    vyraz = str.nextLine();
                    if (!vyraz.equals("I have been learning English for 3 days")) {
                        System.out.println("Ви повинні знати : Я вчу англійську три дні : I have been learning English for 3 days");
                    }
                }
                System.out.print("Я вчу англійську три дні : " + vyraz);
                while (!vyraz.equals("I have been learning English since 9 o'clock")) {
                    System.out.print("\n" + "Введіть переклад : Я вчу англійську з дев'ятої години ");
                    vyraz = str.nextLine();
                    if (!vyraz.equals("I have been learning English since 9 o'clock")) {
                        System.out.println("Ви повинні знати : Я вчу англійську з дев'ятої години : I have been learning English since 9 o'clock");
                    }
                }
                System.out.print("Я вчу англійську з дев'ятої години : " + vyraz);
                while (!vyraz.equals("I am learning English")) {
                    System.out.print("\n" + "Введіть переклад : Я зараз вчу англійську  ");
                    vyraz = str.nextLine();
                    if (!vyraz.equals("I am learning English")) {
                        System.out.println("Ви повинні знати : Я зараз вчу англійську : I am learning English");
                    }
                }
                System.out.print("Я зараз вчу англійську : " + vyraz);
                while (!vyraz.equals("She has been working a lot today and she needs some rest")) {
                    System.out.print("\n" + "Введіть переклад : Вона сьогодні багато працювала (працює, якщо ще працює) і їй необхідно відпочити ");
                    vyraz = str.nextLine();
                    if (!vyraz.equals("She has been working a lot today and she needs some rest")) {
                        System.out.println("Ви повинні знати : Вона сьогодні багато працювала (працює, якщо ще працює) і їй необхідно відпочити : " +
                                "She has been working a lot today and she needs some rest");
                    }
                }
                System.out.print("Вона сьогодні багато працювала (працює, якщо ще працює) і їй необхідно відпочити : " + vyraz);
                while (!vyraz.equals("He has been reading all morning")) {
                    System.out.print("\n" + "Введіть переклад : Він читає(читав, якщо ще ранок, а він вже не читає) весь ранок  ");
                    vyraz = str.nextLine();
                    if (!vyraz.equals("He has been reading all morning")) {
                        System.out.println("Ви повинні знати : Він читає(читав, якщо ще ранок, а він вже не читає) весь ранок   : " +
                                "He has been reading all morning");
                    }
                }
                System.out.print("Він читає(читав, якщо ще ранок, а він вже не читає) весь ранок   : " + vyraz);
                while (!vyraz.equals("I have learned English")) {
                    System.out.print("\n" + "Введіть переклад : Я вже вивчив англійську  ");
                    vyraz = str.nextLine();
                    if (!vyraz.equals("I have learned English")) {
                        System.out.println("Ви повинні знати : Я вже вивчив англійську   : " +
                                "I have learned English");
                    }
                }
                System.out.print("Я вже вивчив англійську   : " + vyraz);
                while (!vyraz.equals("She has not learned English yet")) {
                    System.out.print("\n" + "Введіть переклад : Вона ще не вивчила англійську  ");
                    vyraz = str.nextLine();
                    if (!vyraz.equals("She has not learned English yet")) {
                        System.out.println("Ви повинні знати : Вона ще не вивчила англійську   : " +
                                "She has not learned English yet");
                    }
                }
                System.out.print("Вона ще не вивчила англійську   : " + vyraz);
                while (!vyraz.equals("We have lived here for 10 years")) {
                    System.out.print("\n" + "Введіть переклад : Ми прожили тут 10 років  ");
                    vyraz = str.nextLine();
                    if (!vyraz.equals("We have lived here for 10 years")) {
                        System.out.println("Ви повинні знати : Ми прожили тут 10 років   : " +
                                "We have lived here for 10 years");
                    }
                }
                System.out.print("Ми прожили тут 10 років   : " + vyraz);
                while (!vyraz.equals("We have been living here for 10 years")) {
                    System.out.print("\n" + "Введіть переклад : Ми мешкаємо тут 10 років  ");
                    vyraz = str.nextLine();
                    if (!vyraz.equals("We have been living here for 10 years")) {
                        System.out.println("Ви повинні знати : Ми мешкаємо тут 10 років   : " +
                                "We have been living here for 10 years");
                    }
                }
                System.out.print("Ми мешкаємо тут 10 років   : " + vyraz);
                while (!vyraz.equals("I studied there for 3 years")) {
                    System.out.print("\n" + "Введіть переклад : Я вчився там три роки  ");
                    vyraz = str.nextLine();
                    if (!vyraz.equals("I studied there for 3 years")) {
                        System.out.println("Ви повинні знати : Я вчився там три роки   : " +
                                "I studied there for 3 years");
                    }
                }
                System.out.print("Я вчився там три роки  : " + vyraz);
                while (!vyraz.equals("She lived in Germany for 5 years")) {
                    System.out.print("\n" + "Введіть переклад : Вона прожила в Німеччині 5 років ");
                    vyraz = str.nextLine();
                    if (!vyraz.equals("She lived in Germany for 5 years")) {
                        System.out.println("Ви повинні знати : Вона прожила в Німеччині 5 років   : " +
                                "She lived in Germany for 5 years");
                    }
                }
                System.out.print("Вона прожила в Німеччині 5 років : " + vyraz);
                while (!vyraz.equals("We worked with them for 2 weeks")) {
                    System.out.print("\n" + "Введіть переклад : Ми пропрацювали з ними два тижні ");
                    vyraz = str.nextLine();
                    if (!vyraz.equals("We worked with them for 2 weeks")) {
                        System.out.println("Ви повинні знати : Ми пропрацювали з ними два тижні   : " +
                                "We worked with them for 2 weeks");
                    }
                }
                System.out.print("Ми пропрацювали з ними два тижні : " + vyraz);
                while (!vyraz.equals("She has been working hard lately")) {
                    System.out.print("\n" + "Введіть переклад : Вона багато працювала останнім часом ");
                    vyraz = str.nextLine();
                    if (!vyraz.equals("She has been working hard lately")) {
                        System.out.println("Ви повинні знати : Вона багато працювала останнім часом   : " +
                                "She has been working hard lately");
                    }
                }
                System.out.print("Вона багато працювала останнім часом : " + vyraz);
                while (!vyraz.equals("She has been thinking a lot of moving to Europe lately")) {
                    System.out.print("\n" + "Введіть переклад : Вона багато думала про переїзд в Європу останнім часом ");
                    vyraz = str.nextLine();
                    if (!vyraz.equals("She has been thinking a lot of moving to Europe lately")) {
                        System.out.println("Ви повинні знати : Вона багато думала про переїзд в Європу останнім часом   : " +
                                "She has been thinking a lot of moving to Europe lately");
                    }
                }
                System.out.print("Вона багато думала про переїзд в Європу останнім часом : " + vyraz);
                while (!vyraz.equals("What do you do?")) {
                    System.out.print("\n" + "Введіть переклад : Чим ти займаєшся? ");
                    vyraz = str.nextLine();
                    if (!vyraz.equals("What do you do?")) {
                        System.out.println("Ви повинні знати : Чим ти займаєшся?   : " +
                                "What do you do?");
                    }
                }
                System.out.print("Чим ти займаєшся? : " + vyraz);
                while (!vyraz.equals("What are you doing?")) {
                    System.out.print("\n" + "Введіть переклад : Чим ти зараз займаєшся? ");
                    vyraz = str.nextLine();
                    if (!vyraz.equals("What are you doing?")) {
                        System.out.println("Ви повинні знати : Чим ти зараз займаєшся?   : " +
                                "What are you doing?");
                    }
                }
                System.out.print("Чим ти зараз займаєшся? : " + vyraz);
                while (!vyraz.equals("What have you been doing lately?")) {
                    System.out.print("\n" + "Введіть переклад : Чим ти займався останнім часом? ");
                    vyraz = str.nextLine();
                    if (!vyraz.equals("What have you been doing lately?")) {
                        System.out.println("Ви повинні знати : Чим ти займався останнім часом?   : " +
                                "What have you been doing lately?");
                    }
                }
                System.out.print("Чим ти займався останнім часом? : " + vyraz);
                while (!vyraz.equals("Sam has been talking on the phone for half an hour")) {
                    System.out.print("\n" + "Введіть переклад : Сем розмовляє телефоном вже півгодини ");
                    vyraz = str.nextLine();
                    if (!vyraz.equals("Sam has been talking on the phone for half an hour")) {
                        System.out.println("Ви повинні знати : Сем розмовляє телефоном вже півгодини   : " +
                                "Sam has been talking on the phone for half an hour");
                    }
                }
                System.out.print("Сем розмовляє телефоном вже півгодини : " + vyraz);
                while (!vyraz.equals("She is still talking on the phone")) {
                    System.out.print("\n" + "Введіть переклад : Вона ще розмовляє по телефону ");
                    vyraz = str.nextLine();
                    if (!vyraz.equals("She is still talking on the phone")) {
                        System.out.println("Ви повинні знати : Вона ще розмовляє по телефону  : " +
                                "She is still talking on the phone");
                    }
                }
                System.out.print("Вона ще розмовляє по телефону : " + vyraz);
                while (!vyraz.equals("He rarely talks on the phone")) {
                    System.out.print("\n" + "Введіть переклад : Він рідко розмовляє по телефону ");
                    vyraz = str.nextLine();
                    if (!vyraz.equals("He rarely talks on the phone")) {
                        System.out.println("Ви повинні знати : Він рідко розмовляє по телефону  : " +
                                "He rarely talks on the phone");
                    }
                }
                System.out.print("Він рідко розмовляє по телефону : " + vyraz);
                while (!vyraz.equals("My feet hurt. I have been walking all morning")) {
                    System.out.print("\n" + "Введіть переклад : Мої ноги болять. Я весь ранок на ногах ");
                    vyraz = str.nextLine();
                    if (!vyraz.equals("My feet hurt. I have been walking all morning")) {
                        System.out.println("Ви повинні знати : Мої ноги болять. Я весь ранок на ногах  : " +
                                "My feet hurt. I have been walking all morning");
                    }
                }
                System.out.print("Мої ноги болять. Я весь ранок на ногах : " + vyraz);
                while (!vyraz.equals("He teaches Math")) {
                    System.out.print("\n" + "Введіть переклад : Він викладає математику ");
                    vyraz = str.nextLine();
                    if (!vyraz.equals("He teaches Math")) {
                        System.out.println("Ви повинні знати : Він викладає математику  : " +
                                "He teaches Math");
                    }
                }
                System.out.print(" Він викладає математику : " + vyraz);
                while (!vyraz.equals("He has been teaching for 25 years")) {
                    System.out.print("\n" + "Введіть переклад : Він викладає протягом 25 років ");
                    vyraz = str.nextLine();
                    if (!vyraz.equals("He has been teaching for 25 years")) {
                        System.out.println("Ви повинні знати : Він викладає протягом 25 років  : " +
                                "He has been teaching for 25 years");
                    }
                }
                System.out.print("Він викладає протягом 25 років : " + vyraz);
                while (!vyraz.equals("You look tired")) {
                    System.out.print("\n" + "Введіть переклад : Виглядаєш втомленим ");
                    vyraz = str.nextLine();
                    if (!vyraz.equals("You look tired")) {
                        System.out.println("Ви повинні знати : Виглядаєш втомленим  : " +
                                "You look tired");
                    }
                }
                System.out.print("Виглядаєш втомленим : " + vyraz);
                while (!vyraz.equals("She is looking all over for you")) {
                    System.out.print("\n" + "Введіть переклад : Вона скрізь тебе шукає ");
                    vyraz = str.nextLine();
                    if (!vyraz.equals("She is looking all over for you")) {
                        System.out.println("Ви повинні знати : Вона скрізь тебе шукає  : " +
                                "She is looking all over for you");
                    }
                }
                System.out.print("Вона скрізь тебе шукає : " + vyraz);
                while (!vyraz.equals("I have been looking for you for half an hour")) {
                    System.out.print("\n" + "Введіть переклад : Я тебе шукаю вже півгодини ");
                    vyraz = str.nextLine();
                    if (!vyraz.equals("I have been looking for you for half an hour")) {
                        System.out.println("Ви повинні знати : Я тебе шукаю вже півгодини  : " +
                                "I have been looking for you for half an hour");
                    }
                }
                System.out.print("Я тебе шукаю вже півгодини : " + vyraz);
                while (!vyraz.equals("We are looking for a new job")) {
                    System.out.print("\n" + "Введіть переклад : Ми шукаємо нову роботу ");
                    vyraz = str.nextLine();
                    if (!vyraz.equals("We are looking for a new job")) {
                        System.out.println("Ви повинні знати : Ми шукаємо нову роботу  : " +
                                "We are looking for a new job");
                    }
                }
                System.out.print("Ми шукаємо нову роботу : " + vyraz);
                while (!vyraz.equals("She has been looking a job for 3 weeks but she has found nothing")) {
                    System.out.print("\n" + "Введіть переклад : Вона шукає роботу вже 3 тижні, але так нічого не знайшла ");
                    vyraz = str.nextLine();
                    if (!vyraz.equals("She has been looking a job for 3 weeks but she has found nothing")) {
                        System.out.println("Ви повинні знати : Вона шукає роботу вже 3 тижні, але так нічого не знайшла  : " +
                                "She has been looking a job for 3 weeks but she has found nothing");
                    }
                }
                System.out.print("Вона шукає роботу вже 3 тижні, але так нічого не знайшла : " + vyraz);
                while (!vyraz.equals("She is not working for the time being")) {
                    System.out.print("\n" + "Введіть переклад : Вона тичасово не працює ");
                    vyraz = str.nextLine();
                    if (!vyraz.equals("She is not working for the time being")) {
                        System.out.println("Ви повинні знати : Вона тичасово не працює  : " +
                                "She is not working for the time being");
                    }
                }
                System.out.print("Вона тичасово не працює : " + vyraz);
                while (!vyraz.equals("Have you heard the news?")) {
                    System.out.print("\n" + "Введіть переклад : Ти вже чув новини? ");
                    vyraz = str.nextLine();
                    if (!vyraz.equals("Have you heard the news?")) {
                        System.out.println("Ви повинні знати : Ти вже чув новини?  : " +
                                "Have you heard the news?");
                    }
                }
                System.out.print("Ти вже чув новини? : " + vyraz);
                while (!vyraz.equals("How long have you been working here?")) {
                    System.out.print("\n" + "Введіть переклад : Скільки ви працюєте тут? ");
                    vyraz = str.nextLine();
                    if (!vyraz.equals("How long have you been working here?")) {
                        System.out.println("Ви повинні знати : Скільки ви працюєте тут?  : " +
                                "How long have you been working here?");
                    }
                }
                System.out.print("Скільки ви працюєте тут? : " + vyraz);
                while (!vyraz.equals("Are you working?")) {
                    System.out.print("\n" + "Введіть переклад : Ви працюєте? ");
                    vyraz = str.nextLine();
                    if (!vyraz.equals("Are you working?")) {
                        System.out.println("Ви повинні знати : Ви працюєте?  : " +
                                "Are you working?");
                    }
                }
                System.out.print("Ви працюєте? : " + vyraz);
                while (!vyraz.equals("How long have you worked here?")) {
                    System.out.print("\n" + "Введіть переклад : Як довго ви тут працюєте? ");
                    vyraz = str.nextLine();
                    if (!vyraz.equals("How long have you worked here?")) {
                        System.out.println("Ви повинні знати : Як довго ви тут працюєте?  : " +
                                "How long have you worked here?");
                    }
                }
                System.out.print("Як довго ви тут працюєте? : " + vyraz);
                while (!vyraz.equals("How long did you work here?")) {
                    System.out.print("\n" + "Введіть переклад : Як довго ви тут працювали? ");
                    vyraz = str.nextLine();
                    if (!vyraz.equals("How long did you work here?")) {
                        System.out.println("Ви повинні знати : Як довго ви тут працювали?  : " +
                                "How long did you work here?");
                    }
                }
                System.out.print("Як довго ви тут працювали? : " + vyraz);
                while (!vyraz.equals("Are you done?")) {
                    System.out.print("\n" + "Введіть переклад : Ти закінчив? ");
                    vyraz = str.nextLine();
                    if (!vyraz.equals("Are you done?")) {
                        System.out.println("Ви повинні знати : Ти закінчив?  : " +
                                "Are you done?");
                    }
                }
                System.out.print("Ти закінчив? : " + vyraz);
                while (!vyraz.equals("Not yet. I am still working")) {
                    System.out.print("\n" + "Введіть переклад : Ще ні. Все ще працюю ");
                    vyraz = str.nextLine();
                    if (!vyraz.equals("Not yet. I am still working")) {
                        System.out.println("Ви повинні знати : Ще ні. Все ще працюю  : " +
                                "Not yet. I am still working");
                    }
                }
                System.out.print("Ще ні. Все ще працюю : " + vyraz);
                while (!vyraz.equals("How long has she been studying?")) {
                    System.out.print("\n" + "Введіть переклад : Скільки вона вже вчиться? ");
                    vyraz = str.nextLine();
                    if (!vyraz.equals("How long has she been studying?")) {
                        System.out.println("Ви повинні знати : Скільки вона вже вчиться?  : " +
                                "How long has she been studying?");
                    }
                }
                System.out.print("Скільки вона вже вчиться? : " + vyraz);
                while (!vyraz.equals("I lost my job")) {
                    System.out.print("\n" + "Введіть переклад : Я втратив роботу ");
                    vyraz = str.nextLine();
                    if (!vyraz.equals("I lost my job")) {
                        System.out.println("Ви повинні знати : Я втратив роботу  : " +
                                "I lost my job");
                    }
                }
                System.out.print("Я втратив роботу : " + vyraz);
                while (!vyraz.equals("And what are you doing for the time being?")) {
                    System.out.print("\n" + "Введіть переклад : А чим ти поки займаєшся? ");
                    vyraz = str.nextLine();
                    if (!vyraz.equals("And what are you doing for the time being?")) {
                        System.out.println("Ви повинні знати : А чим ти поки займаєшся?  : " +
                                "And what are you doing for the time being?");
                    }
                }
                System.out.print("А чим ти поки займаєшся? : " + vyraz);

                while (!vyraz.equals("How long are you waiting for me?")) {
                    System.out.print("\n" + "Введіть переклад : Як довго ви мене чекаєте? ");
                    vyraz = str.nextLine();
                    if (!vyraz.equals("How long are you waiting for me?")) {
                        System.out.println("Ви повинні знати : Як довго ви мене чекаєте?  : " +
                                "How long are you waiting for me?");
                    }
                }
                System.out.print("Як довго ви мене чекаєте? : " + vyraz);

                while (!vyraz.equals("What have you been doing since I left?")) {
                    System.out.print("\n" + "Введіть переклад : Що ви робите з того часу, як я поїхав? ");
                    vyraz = str.nextLine();
                    if (!vyraz.equals("What have you been doing since I left?")) {
                        System.out.println("Ви повинні знати : Що ви робите з того часу, як я поїхав?  : " +
                                "What have you been doing since I left?");
                    }
                }
                System.out.print("Що ви робите з того часу, як я поїхав? : " + vyraz);
                while (!vyraz.equals("Where did you live for the last 2 years?")) {
                    System.out.print("\n" + "Де ви мешкали останні два роки? ");
                    vyraz = str.nextLine();
                    if (!vyraz.equals("Where did you live for the last 2 years?")) {
                        System.out.println("Ви повинні знати : Де ви мешкали останні два роки?  : " +
                                "Where did you live for the last 2 years?");
                    }
                }
                System.out.print("Де ви мешкали останні два роки? : " + vyraz);
                System.out.print("Що ви робите з того часу, як я поїхав? : " + vyraz);
                while (!vyraz.equals("I am not driving")) {
                    System.out.print("\n" + "Я зараз не за кермом ");
                    vyraz = str.nextLine();
                    if (!vyraz.equals("I am not driving")) {
                        System.out.println("Ви повинні знати : Я зараз не за кермом  : " +
                                "I am not driving");
                    }
                }
                System.out.print("Я зараз не за кермом : " + vyraz);
                while (!vyraz.equals("I do not drive")) {
                    System.out.print("\n" + "Я не вожу машину ");
                    vyraz = str.nextLine();
                    if (!vyraz.equals("I do not drive")) {
                        System.out.println("Ви повинні знати : Я не вожу машину  : " +
                                "I do not drive");
                    }
                }
                System.out.print("Я не вожу машину : " + vyraz);
                while (!vyraz.equals("I have not been driving a long time")) {
                    System.out.print("\n" + "Я давно не сідав за кермо ");
                    vyraz = str.nextLine();
                    if (!vyraz.equals("I have not been driving a long time")) {
                        System.out.println("Я давно не сідав за кермо  : " +
                                "I have not been driving a long time");
                    }
                }
                System.out.print("Я давно не сідав за кермо : " + vyraz);
                while (!vyraz.equals("What have you been doing all day long?")) {
                    System.out.print("\n" + "Чим ти займався цілий день? ");
                    vyraz = str.nextLine();
                    if (!vyraz.equals("What have you been doing all day long?")) {
                        System.out.println("Чим ти займався цілий день?  : " +
                                "What have you been doing all day long?");
                    }
                }
                System.out.print("Чим ти займався цілий день? : " + vyraz);
                while (!vyraz.equals("I did not follow the news")) {
                    System.out.print("\n" + "Я не слідкував за новинами ");
                    vyraz = str.nextLine();
                    if (!vyraz.equals("I did not follow the news")) {
                        System.out.println("Я не слідкував за новинами  : " +
                                "I did not follow the news");
                    }
                }
                System.out.print("Я не слідкував за новинами : " + vyraz);
                while (!vyraz.equals("What is happened?")) {
                    System.out.print("\n" + "Що трапилося? ");
                    vyraz = str.nextLine();
                    if (!vyraz.equals("What is happened?")) {
                        System.out.println("Що трапилося?  : " +
                                "What is happened?");
                    }
                }
                System.out.print("Що трапилося? : " + vyraz);
                while (!vyraz.equals("Why are you so dirty? What have you been doing?")) {
                    System.out.print("\n" + "Чому ти такий брудний? Що ти робив? ");
                    vyraz = str.nextLine();
                    if (!vyraz.equals("Why are you so dirty? What have you been doing?")) {
                        System.out.println("Чому ти такий брудний? Що ти робив?  : " +
                                "Why are you so dirty? What have you been doing?");
                    }
                }
                System.out.print("Чому ти такий брудний? Що ти робив? : " + vyraz);
                while (!vyraz.equals("He has been training at the gym for several weeks")) {
                    System.out.print("\n" + "Він трнується в залі декілька тижнів ");
                    vyraz = str.nextLine();
                    if (!vyraz.equals("He has been training at the gym for several weeks")) {
                        System.out.println("Він трнується в залі декілька тижнів  : " +
                                "He has been training at the gym for several weeks");
                    }
                }
                System.out.print("Він трнується в залі декілька тижнів : " + vyraz);
                while (!vyraz.equals("I can not talk. I am training")) {
                    System.out.print("\n" + "Я не можу розмовляти. Я тренуюся ");
                    vyraz = str.nextLine();
                    if (!vyraz.equals("I can not talk. I am training")) {
                        System.out.println("Я не можу розмовляти. Я тренуюся  : " +
                                "I can not talk. I am training");
                    }
                }
                System.out.print("Я не можу розмовляти. Я тренуюся : " + vyraz);
                while (!vyraz.equals("I have not been training at the gym lately")) {
                    System.out.print("\n" + "Я не тренуюся в залі останнім часом ");
                    vyraz = str.nextLine();
                    if (!vyraz.equals("I have not been training at the gym lately")) {
                        System.out.println("Я не тренуюся в залі останнім часом  : " +
                                "I have not been training at the gym lately");
                    }
                }
                System.out.print("Я не тренуюся в залі останнім часом : " + vyraz);
                while (!vyraz.equals("I have not been cooking for very long")) {
                    System.out.print("\n" + "Я дуже давно не готую ");
                    vyraz = str.nextLine();
                    if (!vyraz.equals("I have not been cooking for very long")) {
                        System.out.println("Я дуже давно не готую  : " +
                                "I have not been cooking for very long");
                    }
                }
                System.out.print("Я дуже давно не готую  : " + vyraz);
                while (!vyraz.equals("How long have you been driving?")) {
                    System.out.print("\n" + "Ти давно водиш машину? ");
                    vyraz = str.nextLine();
                    if (!vyraz.equals("How long have you been driving?")) {
                        System.out.println("Ти давно водиш машину?  : " +
                                "How long have you been driving?");
                    }
                }
                System.out.print("Ти давно водиш машину?  : " + vyraz);
                while (!vyraz.equals("Have you been working here all day long?")) {
                    System.out.print("\n" + "Ти працюєш тут цілий день? ");
                    vyraz = str.nextLine();
                    if (!vyraz.equals("Have you been working here all day long?")) {
                        System.out.println("Ти працюєш тут цілий день?  : " +
                                "Have you been working here all day long?");
                    }
                }
                System.out.print("Ти працюєш тут цілий день?  : " + vyraz);
                while (!vyraz.equals("We have been cleaning the house since very morning but we have not finished yet")) {
                    System.out.print("\n" + "Ми прибираємо будинок цілий ранок і ще не закінчили ");
                    vyraz = str.nextLine();
                    if (!vyraz.equals("We have been cleaning the house since very morning but we have not finished yet")) {
                        System.out.println("Ми прибираємо будинок цілий ранок і ще не закінчили  : " +
                                "We have been cleaning the house since very morning but we have not finished yet");
                    }
                }
                System.out.print("Ми прибираємо будинок цілий ранок і ще не закінчили  : " + vyraz);
                while (!vyraz.equals("They have been seen him lately")) {
                    System.out.print("\n" + "Вони бачили його останнім часом ");
                    vyraz = str.nextLine();
                    if (!vyraz.equals("They have been seen him lately")) {
                        System.out.println("Вони бачили його останнім часом  : " +
                                "They have been seen him lately");
                    }
                }
                System.out.print("Вони бачили його останнім часом  : " + vyraz);
                while (!vyraz.equals("They saw him lately")) {
                    System.out.print("\n" + "Вони бачили його нещодавно ");
                    vyraz = str.nextLine();
                    if (!vyraz.equals("They saw him lately")) {
                        System.out.println("Вони бачили його нещодавно  : " +
                                "They saw him lately");
                    }
                }
                System.out.print("Вони бачили його нещодавно  : " + vyraz);
                while (!vyraz.equals("I do not feel well lately")) {
                    System.out.print("\n" + "Останнім часом я погано почуваюся ");
                    vyraz = str.nextLine();
                    if (!vyraz.equals("I do not feel well lately")) {
                        System.out.println("Останнім часом я погано почуваюся  : " +
                                "I do not feel well lately");
                    }
                }
                System.out.print("Останнім часом я погано почуваюся  : " + vyraz);
                while (!vyraz.equals("I did not pay much attention to that")) {
                    System.out.print("\n" + "Я не звернув на це особливої уваги ");
                    vyraz = str.nextLine();
                    if (!vyraz.equals("I did not pay much attention to that")) {
                        System.out.println("Я не звернув на це особливої уваги  : " +
                                "I did not pay much attention to that");
                    }
                }
                System.out.print("Я не звернув на це особливої уваги  : " + vyraz);
                while (!vyraz.equals("I have not been paying much attention to that")) {
                    System.out.print("\n" + "Я не звертав на це особливої уваги ");
                    vyraz = str.nextLine();
                    if (!vyraz.equals("I have not been paying much attention to that")) {
                        System.out.println("Я не звертав на це особливої уваги  : " +
                                "I have not been paying much attention to that");
                    }
                }
                System.out.print("Я не звертав на це особливої уваги  : " + vyraz);
                while (!vyraz.equals("We have been working there since January but we have not made mach money")) {
                    System.out.print("\n" + "Ми працюємо там із січня, але не заробили великих грошей ");
                    vyraz = str.nextLine();
                    if (!vyraz.equals("We have been working there since January but we have not made mach money")) {
                        System.out.println("Ми працюємо там із січня, але не заробили великих грошей : " +
                                "We have been working there since January but we have not made mach money");
                    }
                }
                System.out.print("Ми працюємо там із січня, але не заробили великих грошей : " + vyraz);
                while (!vyraz.equals("I do not know how long she did it")) {
                    System.out.print("\n" + "Я не знаю, як довго вона це робила ");
                    vyraz = str.nextLine();
                    if (!vyraz.equals("I do not know how long she did it")) {
                        System.out.println("Я не знаю, як довго вона це робила : " +
                                "I do not know how long she did it");
                    }
                }
                System.out.print("Я не знаю, як довго вона це робила : " + vyraz);
                while (!vyraz.equals("I do not know how long she has been doing it")) {
                    System.out.print("\n" + "Я не знаю, як довго вона це робить ");
                    vyraz = str.nextLine();
                    if (!vyraz.equals("I do not know how long she has been doing it")) {
                        System.out.println("Я не знаю, як довго вона це робить : " +
                                "I do not know how long she has been doing it");
                    }
                }
                System.out.print("Я не знаю, як довго вона це робить : " + vyraz);
                while (!vyraz.equals("Are you looking for an apartment?")) {
                    System.out.print("\n" + "Ти шукаєш квартиру? ");
                    vyraz = str.nextLine();
                    if (!vyraz.equals("Are you looking for an apartment?")) {
                        System.out.println("Ти шукаєш квартиру? : " +
                                "Are you looking for an apartment?");
                    }
                }
                System.out.print("Ти шукаєш квартиру? : " + vyraz);
                while (!vyraz.equals("I am staying with my friends for the time being")) {
                    System.out.print("\n" + "Я тимчасово зупинився (мешкаю) у друзів ");
                    vyraz = str.nextLine();
                    if (!vyraz.equals("I am staying with my friends for the time being")) {
                        System.out.println("Я тимчасово зупинився (мешкаю) у друзів : " +
                                "I am staying with my friends for the time being");
                    }
                }
                System.out.print("Я тимчасово зупинився (мешкаю) у друзів : " + vyraz);
                while (!vyraz.equals("It's still raining")) {
                    System.out.print("\n" + "Дощ все ще йде ");
                    vyraz = str.nextLine();
                    if (!vyraz.equals("It's still raining")) {
                        System.out.println("Дощ все ще йде : " +
                                "It's still raining");
                    }
                }
                System.out.print("Дощ все ще йде : " + vyraz);
                while (!vyraz.equals("It's been raining for 2 hours")) {
                    System.out.print("\n" + "Дощ вже йде 2 години ");
                    vyraz = str.nextLine();
                    if (!vyraz.equals("It's been raining for 2 hours")) {
                        System.out.println("Дощ вже йде 2 години  : " +
                                "It's been raining for 2 hours");
                    }
                }
                System.out.print("Дощ вже йде 2 години  : " + vyraz);
                while (!vyraz.equals("It often rains here")) {
                    System.out.print("\n" + "Тут часто йдуть дощі ");
                    vyraz = str.nextLine();
                    if (!vyraz.equals("It often rains here")) {
                        System.out.println("Тут часто йдуть дощі  : " +
                                "It often rains here");
                    }
                }
                System.out.print("Тут часто йдуть дощі  : " + vyraz);
                while (!vyraz.equals("The ground is wet. It's been reining lately")) {
                    System.out.print("\n" + "Земля волога. Нещодавно йшов дощ ");
                    vyraz = str.nextLine();
                    if (!vyraz.equals("The ground is wet. It's been reining lately")) {
                        System.out.println("Земля волога. Нещодавно йшов дощ  : " +
                                "The ground is wet. It's been reining lately");
                    }
                }
                System.out.print("Земля волога. Нещодавно йшов дощ : " + vyraz);
                while (!vyraz.equals("I typed 11 pages")) {
                    System.out.print("\n" + "Я набрав 11 сторінок ");
                    vyraz = str.nextLine();
                    if (!vyraz.equals("I typed 11 pages")) {
                        System.out.println("Я набрав 11 сторінок  : " +
                                "I typed 11 pages");
                    }
                }
                System.out.print("Я набрав 11 сторінок : " + vyraz);
                while (!vyraz.equals("I have been typing all morning")) {
                    System.out.print("\n" + "Я друкую цілий ранок ");
                    vyraz = str.nextLine();
                    if (!vyraz.equals("I have been typing all morning")) {
                        System.out.println("Я друкую цілий ранок  : " +
                                "I have been typing all morning");
                    }
                }
                System.out.print("Я друкую цілий ранок : " + vyraz);
                while (!vyraz.equals("She is upset because she has lost her phone")) {
                    System.out.print("\n" + "Вона засмучена тому що загубила свій телефон ");
                    vyraz = str.nextLine();
                    if (!vyraz.equals("She is upset because she has lost her phone")) {
                        System.out.println("Вона засмучена тому що загубила свій телефон  : " +
                                "She is upset because she has lost her phone");
                    }
                }
                System.out.print("Вона засмучена тому що загубила свій телефон : " + vyraz);
                while (!vyraz.equals("He is angry because we do not want to go there")) {
                    System.out.print("\n" + "Він злится тому, що ми не бажаємо їхати туди ");
                    vyraz = str.nextLine();
                    if (!vyraz.equals("He is angry because we do not want to go there")) {
                        System.out.println("Він злится тому, що ми не бажаємо їхати туди  : " +
                                "He is angry because we do not want to go there");
                    }
                }
                System.out.print("Він злится тому, що ми не бажаємо їхати туди: " + vyraz);
                while (!vyraz.equals("He is angry because she left")) {
                    System.out.print("\n" + "Він злится тому, що вона поїхала ");
                    vyraz = str.nextLine();
                    if (!vyraz.equals("He is angry because she left")) {
                        System.out.println("Він злится тому, що вона поїхала  : " +
                                "He is angry because she left");
                    }
                }
                System.out.print("Він злится тому, що вона поїхала: " + vyraz);
                while (!vyraz.equals("He is angry because he has been waiting for you for 2 hours")) {
                    System.out.print("\n" + "Він злится тому, що він чекає тебе вже дві години ");
                    vyraz = str.nextLine();
                    if (!vyraz.equals("He is angry because he has been waiting for you for 2 hours")) {
                        System.out.println("Він злится тому, що він чекає тебе вже дві години : " +
                                "He is angry because he has been waiting for you for 2 hours");
                    }
                }
                System.out.print("Він злится тому, що він чекає тебе вже дві години " + vyraz);
                while (!vyraz.equals("My back hurts")) {
                    System.out.print("\n" + "Моя спина болить ");
                    vyraz = str.nextLine();
                    if (!vyraz.equals("My back hurts")) {
                        System.out.println("Моя спина болить : " +
                                "My back hurts");
                    }
                }
                System.out.print("Моя спина болить " + vyraz);
                while (!vyraz.equals("I have been gardening")) {
                    System.out.print("\n" + "Я працював в саду ");
                    vyraz = str.nextLine();
                    if (!vyraz.equals("I have been gardening")) {
                        System.out.println("Я працював в саду : " +
                                "I have been gardening");
                    }
                }
                System.out.print("Я працював в саду " + vyraz);
                while (!vyraz.equals("They have been often asking me about that recently")) {
                    System.out.print("\n" + "Вони останнім часом постійно питали мене про це ");
                    vyraz = str.nextLine();
                    if (!vyraz.equals("They have been often asking me about that recently")) {
                        System.out.println("Вони останнім часом постійно питали мене про це : " +
                                "They have been often asking me about that recently");
                    }
                }
                System.out.print("Вони останнім часом постійно питали мене про це " + vyraz);
                while (!vyraz.equals("I have been traveling to Boston twice a year since my son moved to the USA")) {
                    System.out.print("\n" + "Я відвідую Бостон дважди на рік після того як мій син переїхав в США ");
                    vyraz = str.nextLine();
                    if (!vyraz.equals("I have been traveling to Boston twice a year since my son moved to the USA")) {
                        System.out.println("Я відвідую Бостон дважди на рік після того як мій син переїхав в США : " +
                                "I have been traveling to Boston twice a year since my son moved to the USA");
                    }
                }
                System.out.print("Я відвідую Бостон дважди на рік після того як мій син переїхав в США " + vyraz);
                while (!vyraz.equals("Are they done?")) {
                    System.out.print("\n" + "Вони закінчили? ");
                    vyraz = str.nextLine();
                    if (!vyraz.equals("Are they done?")) {
                        System.out.println("Вони закінчили? : " +
                                "Are they done?");
                    }
                }
                System.out.print("Вони закінчили? " + vyraz);
                while (!vyraz.equals("No they are still talking")) {
                    System.out.print("\n" + "Ні все ще розмовляють ");
                    vyraz = str.nextLine();
                    if (!vyraz.equals("No they are still talking")) {
                        System.out.println("Ні все ще розмовляють : " +
                                "No they are still talking");
                    }
                }
                System.out.print("Ні все ще розмовляють " + vyraz);
                while (!vyraz.equals("I have been receiving unemployment benefit since I lost my job")) {
                    System.out.print("\n" + "Я отримую допомогу з безробіття з тих пір, як втратив роботу ");
                    vyraz = str.nextLine();
                    if (!vyraz.equals("I have been receiving unemployment benefit since I lost my job")) {
                        System.out.println("Я отримую допомогу з безробіття з тих пір, як втратив роботу : " +
                                "I have been receiving unemployment benefit since I lost my job");
                    }
                }
                System.out.print("Я отримую допомогу з безробіття з тих пір, як втратив роботу " + vyraz);
                while (!vyraz.equals("He has not been attending classes regularly since he got a job")) {
                    System.out.print("\n" + "Він регулярно не відвідує заняття с тих пір, як влаштувався на роботу ");
                    vyraz = str.nextLine();
                    if (!vyraz.equals("He has not been attending classes regularly since he got a job")) {
                        System.out.println("Він регулярно не відвідує заняття с тих пір, як влаштувався на роботу : " +
                                "He has not been attending classes regularly since he got a job");
                    }
                }
                System.out.print("Він регулярно не відвідує заняття с тих пір, як влаштувався на роботу " + vyraz);
                while (!vyraz.equals("I have been fixing the door for half an hour and I still have not finished")) {
                    System.out.print("\n" + "Я ремонтую двері вже півгодини і ще не закінчив ");
                    vyraz = str.nextLine();
                    if (!vyraz.equals("I have been fixing the door for half an hour and I still have not finished")) {
                        System.out.println("Я ремонтую двері вже півгодини і ще не закінчив : " +
                                "I have been fixing the door for half an hour and I still have not finished");
                    }
                }
                System.out.print("Я ремонтую двері вже півгодини і ще не закінчив " + vyraz);
                while (!vyraz.equals("It rarely snows here")) {
                    System.out.print("\n" + "Тут рідко випадає сніг ");
                    vyraz = str.nextLine();
                    if (!vyraz.equals("It rarely snows here")) {
                        System.out.println("Тут рідко випадає сніг : " +
                                "It rarely snows here");
                    }
                }
                System.out.print("Тут рідко випадає сніг " + vyraz);

                while (!vyraz.equals("It has not snowed in San Francisco for 9 years")) {
                    System.out.print("\n" + "В Сан Франциско не було снігу вже 9 років ");
                    vyraz = str.nextLine();
                    if (!vyraz.equals("It has not snowed in San Francisco for 9 years")) {
                        System.out.println("В Сан Франциско не було снігу вже 9 років : " +
                                "It has not snowed in San Francisco for 9 years");
                    }
                }
                System.out.print("В Сан Франциско не було снігу вже 9 років " + vyraz);
                while (!vyraz.equals("How long has it been snowing?")) {
                    System.out.print("\n" + "Як довго вже йде сніг? ");
                    vyraz = str.nextLine();
                    if (!vyraz.equals("How long has it been snowing?")) {
                        System.out.println("Як довго вже йде сніг? : " +
                                "How long has it been snowing?");
                    }
                }
                System.out.print("Як довго вже йде сніг? " + vyraz);
                while (!vyraz.equals("How long does it snow?")) {
                    System.out.print("\n" + "Як довго йде сніг? ");
                    vyraz = str.nextLine();
                    if (!vyraz.equals("How long does it snow?")) {
                        System.out.println("Як довго йде сніг? : " +
                                "How long does it snow?");
                    }
                }
                System.out.print("Як довго йде сніг? " + vyraz);
                while (!vyraz.equals("Did it ever snow there at all?")) {
                    System.out.print("\n" + "Там взагалі колись випадав сніг? ");
                    vyraz = str.nextLine();
                    if (!vyraz.equals("Did it ever snow there at all?")) {
                        System.out.println("Там взагалі колись випадав сніг? : " +
                                "Did it ever snow there at all?");
                    }
                }
                System.out.print("Там взагалі колись випадав сніг? " + vyraz);
                while (!vyraz.equals("Has it ever snowed there?")) {
                    System.out.print("\n" + "Там колись йшов сніг? ");
                    vyraz = str.nextLine();
                    if (!vyraz.equals("Has it ever snowed there?")) {
                        System.out.println("Там колись йшов сніг? : " +
                                "Has it ever snowed there?");
                    }
                }
                System.out.print("Там колись йшов сніг?? " + vyraz);
                while (!vyraz.equals("It's snowing outside. Lets go out for a walk")) {
                    System.out.print("\n" + "На вулиці йде сніг. Пішли погуляємо");
                    vyraz = str.nextLine();
                    if (!vyraz.equals("It's snowing outside. Lets go out for a walk")) {
                        System.out.println("На вулиці йде сніг. Пішли погуляємо : " +
                                "It's snowing outside. Lets go out for a walk");
                    }
                }
                System.out.print("На вулиці йде сніг. Пішли погуляємо " + vyraz);
                while (!vyraz.equals("Is it snowing hard?")) {
                    System.out.print("\n" + "Сильний сніг?");
                    vyraz = str.nextLine();
                    if (!vyraz.equals("Is it snowing hard?")) {
                        System.out.println("Сильний сніг?: " +
                                "Is it snowing hard?");
                    }
                }
                System.out.print("Сильний сніг? " + vyraz);
                while (!vyraz.equals("It's been snowing for 2 days")) {
                    System.out.print("\n" + "Сніг іде на протязі двох днів");
                    vyraz = str.nextLine();
                    if (!vyraz.equals("It's been snowing for 2 days")) {
                        System.out.println("Сніг іде на протязі двох днів: " +
                                "It's been snowing for 2 days");
                    }
                }
                System.out.print("Сніг іде на протязі двох днів " + vyraz);
                while (!vyraz.equals("She is getting better")) {
                    System.out.print("\n" + "Їй стає краще");
                    vyraz = str.nextLine();
                    if (!vyraz.equals("She is getting better")) {
                        System.out.println("Їй стає краще: " +
                                "She is getting better");
                    }
                }
                System.out.print("Їй стає краще " + vyraz);
                while (!vyraz.equals("She gets better every summer")) {
                    System.out.print("\n" + "Їй стає краще кожного літа");
                    vyraz = str.nextLine();
                    if (!vyraz.equals("She gets better every summer")) {
                        System.out.println("Їй стає краще кожного літа: " +
                                "She gets better every summer");
                    }
                }
                System.out.print("Їй стає краще кожного літа " + vyraz);
                while (!vyraz.equals("She has been feeling better lately")) {
                    System.out.print("\n" + "Останнім часом вона почувається краще");
                    vyraz = str.nextLine();
                    if (!vyraz.equals("She has been feeling better lately")) {
                        System.out.println("Останнім часом вона почувається краще: " +
                                "She has been feeling better lately");
                    }
                }
                System.out.print("Останнім часом вона почувається краще " + vyraz);
                while (!vyraz.equals("She did not get better")) {
                    System.out.print("\n" + "Їй не стало краще");
                    vyraz = str.nextLine();
                    if (!vyraz.equals("She did not get better")) {
                        System.out.println("Їй не стало краще: " +
                                "She did not get better");
                    }
                }
                System.out.print("Їй не стало краще " + vyraz);
                while (!vyraz.equals("Is she getting better?")) {
                    System.out.print("\n" + "Їй стає краще?");
                    vyraz = str.nextLine();
                    if (!vyraz.equals("Is she getting better?")) {
                        System.out.println("Їй стає краще?: " +
                                "Is she getting better?");
                    }
                }
                System.out.print("Їй стає краще? " + vyraz);
                while (!vyraz.equals("Did she get better?")) {
                    System.out.print("\n" + "Їй стало краще?");
                    vyraz = str.nextLine();
                    if (!vyraz.equals("Did she get better?")) {
                        System.out.println("Їй стало краще?: " +
                                "Did she get better?");
                    }
                }
                System.out.print("Їй стало краще? " + vyraz);
                while (!vyraz.equals("I have fixed a car for first time")) {
                    System.out.print("\n" + "Я вперше ремонтував машину");
                    vyraz = str.nextLine();
                    if (!vyraz.equals("I have fixed a car for first time")) {
                        System.out.println("Я вперше ремонтував машину: " +
                                "I have fixed a car for first time");
                    }
                }
                System.out.print("Я вперше ремонтував машину " + vyraz);
                while (!vyraz.equals("He has been fixing the car since last friday")) {
                    System.out.print("\n" + "Він ремонтує машину з прошлої п'ятниці");
                    vyraz = str.nextLine();
                    if (!vyraz.equals("He has been fixing the car since last friday")) {
                        System.out.println("Він ремонтує машину з прошлої п'ятниці: " +
                                "He has been fixing the car since last friday");
                    }
                }
                System.out.print("Він ремонтує машину з прошлої п'ятниці " + vyraz);
                while (!vyraz.equals("Do you fix cars?")) {
                    System.out.print("\n" + "Ви ремонтуєте машини?");
                    vyraz = str.nextLine();
                    if (!vyraz.equals("Do you fix cars?")) {
                        System.out.println("Ви ремонтуєте машини?: " +
                                "Do you fix cars?");
                    }
                }
                System.out.print("Ви ремонтуєте машини? " + vyraz);
                while (!vyraz.equals("Do you clear goods?")) {
                    System.out.print("\n" + "Ви розмитнюєте товари?");
                    vyraz = str.nextLine();
                    if (!vyraz.equals("Do you clear goods?")) {
                        System.out.println("Ви розмитнюєте товари?: " +
                                "Do you clear goods?");
                    }
                }
                System.out.print("Ви розмитнюєте товари? " + vyraz);
                while (!vyraz.equals("They are busy. They are still fixing the car")) {
                    System.out.print("\n" + "Вони зайняті. Вони ще ремонтують машину");
                    vyraz = str.nextLine();
                    if (!vyraz.equals("They are busy. They are still fixing the car")) {
                        System.out.println("Вони зайняті. Вони ще ремонтують машину: " +
                                "They are busy. They are still fixing the car");
                    }
                }
                System.out.print("Вони зайняті. Вони ще ремонтують машину " + vyraz);
                while (!vyraz.equals("How long have you been fixing the car?")) {
                    System.out.print("\n" + "Скільки ви ремонтуєте машину?");
                    vyraz = str.nextLine();
                    if (!vyraz.equals("How long have you been fixing the car?")) {
                        System.out.println("Скільки ви ремонтуєте машину?: " +
                                "How long have you been fixing the car?");
                    }
                }
                System.out.print("Скільки ви ремонтуєте машину? " + vyraz);
                while (!vyraz.equals("We have not fixed the car")) {
                    System.out.print("\n" + "Ми ще не відремонтували машину");
                    vyraz = str.nextLine();
                    if (!vyraz.equals("We have not fixed the car")) {
                        System.out.println("Ми ще не відремонтували машину: " +
                                "We have not fixed the car");
                    }
                }
                System.out.print("Ми ще не відремонтували машину " + vyraz);
                while (!vyraz.equals("I am dirty because I have been fixing the car")) {
                    System.out.print("\n" + "Я брудний тому, що ремонтував машину");
                    vyraz = str.nextLine();
                    if (!vyraz.equals("I am dirty because I have been fixing the car")) {
                        System.out.println("Я брудний тому, що ремонтував машину: " +
                                "I am dirty because I have been fixing the car");
                    }
                }
                System.out.print("Я брудний тому, що ремонтував машину " + vyraz);
                while (!vyraz.equals("Why is my device on? Who has been working on it?")) {
                    System.out.print("\n" + "Чому мій гаджед увімкнений? Хто працював на ньому?");
                    vyraz = str.nextLine();
                    if (!vyraz.equals("Why is my device on? Who has been working on it?")) {
                        System.out.println("Чому мій гаджед увімкнений? Хто працював на ньому?: " +
                                "Why is my device on? Who has been working on it?");
                    }
                }
                System.out.print("Чому мій гаджед увімкнений? Хто працював на ньому? " + vyraz);
                while (!vyraz.equals("How long have you been waiting for me?")) {
                    System.out.print("\n" + "Скільки ви мене чекаєте?");
                    vyraz = str.nextLine();
                    if (!vyraz.equals("How long have you been waiting for me?")) {
                        System.out.println("Скільки ви мене чекаєте?: " +
                                "How long have you been waiting for me?");
                    }
                }
                System.out.print("Скільки ви мене чекаєте? " + vyraz);
                while (!vyraz.equals("How long has it been going on?")) {
                    System.out.print("\n" + "Скільки це триває?");
                    vyraz = str.nextLine();
                    if (!vyraz.equals("How long has it been going on?")) {
                        System.out.println("Скільки це триває?: " +
                                "How long has it been going on?");
                    }
                }
                System.out.print("Скільки це триває? " + vyraz);
                while (!vyraz.equals("I am here for a weak")) {
                    System.out.print("\n" + "Я тут на тиждень");
                    vyraz = str.nextLine();
                    if (!vyraz.equals("I am here for a weak")) {
                        System.out.println("Я тут на тиждень: " +
                                "I am here for a weak");
                    }
                }
                System.out.print("Я тут на тиждень " + vyraz);
                while (!vyraz.equals("How much have you done?")) {
                    System.out.print("\n" + "Скільки ти вже зробив?");
                    vyraz = str.nextLine();
                    if (!vyraz.equals("How much have you done?")) {
                        System.out.println("Скільки ти вже зробив?: " +
                                "How much have you done?");
                    }
                }
                System.out.print("Скільки ти вже зробив? " + vyraz);
                while (!vyraz.equals("How long have you been dealing with it?")) {
                    System.out.print("\n" + "Скільки ви цим займаєтеся?");
                    vyraz = str.nextLine();
                    if (!vyraz.equals("How long have you been dealing with it?")) {
                        System.out.println("Скільки ви цим займаєтеся?: " +
                                "How long have you been dealing with it?");
                    }
                }
                System.out.print("Скільки ви цим займаєтеся? " + vyraz);
                while (!vyraz.equals("I have been thinking how to do that but I have not figured out how yet")) {
                    System.out.print("\n" + "Я думав як це зробити, але ще не придумав як");
                    vyraz = str.nextLine();
                    if (!vyraz.equals("I have been thinking how to do that but I have not figured out how yet")) {
                        System.out.println("Я думав як це зробити, але ще не придумав як: " +
                                "I have been thinking how to do that but I have not figured out how yet");
                    }
                }
                System.out.print("Я думав як це зробити, але ще не придумав як " + vyraz);
                while (!vyraz.equals("Have you figured out what she has been doing lately?")) {
                    System.out.print("\n" + "Ти вже з'ясував чим вона займалася останнім часом?");
                    vyraz = str.nextLine();
                    if (!vyraz.equals("Have you figured out what she has been doing lately?")) {
                        System.out.println("Ти вже з'ясував чим вона займалася останнім часом?: " +
                                "Have you figured out what she has been doing lately?");
                    }
                }
                System.out.print("Ти вже з'ясував чим вона займалася останнім часом? " + vyraz);
                while (!vyraz.equals("How long have you been taking the medication?")) {
                    System.out.print("\n" + "Скільки ви вже приймаєте ці ліки?");
                    vyraz = str.nextLine();
                    if (!vyraz.equals("How long have you been taking the medication?")) {
                        System.out.println("Скільки ви вже приймаєте ці ліки?: " +
                                "How long have you been taking the medication?");
                    }
                }
                System.out.print("Скільки ви вже приймаєте ці ліки? " + vyraz);
                }
                    }





