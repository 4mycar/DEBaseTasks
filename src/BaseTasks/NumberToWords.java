package BaseTasks;

public class NumberToWords {


        private static final String[][] digNames1_9 = {{"одна", "две", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять"},
                {"один", "два"}};
        private static final String[] digNames10_19 = {"десять","одиннадцать", "двенадцать", "тринадцать", "четырнадцать",
                "пятнадцать", "шестнадцать", "семнадцать", "восемнадцать", "девятнадцать"};
        private static final String[] digNames20_90 = {"двадцать", "тридцать", "сорок", "пятьдесят",
                "шестьдесят", "семьдесят", "восемьдесят", "девяносто"};
        private static final String[] digNames100_900 = {"сто","двести", "триста", "четыреста", "пятьсот",
                "шестьсот", "семьсот", "восемьсот", "девятьсот"};
        private static final String[][] digNames1k_1m = {
                {"тысяча", "тысячи", "тысяч", "0"},
                {"миллион", "миллиона", "миллионов", "1"},
                {"миллиард", "миллиарда", "миллиардов", "1"},
                {"триллион", "триллиона", "триллионов", "1"}};

        //рекурсивная функция преобразования целого числа num в строки
        private static String num2words(long num, int level) {
            String result;
            StringBuilder words = new StringBuilder(50);

            if (num==0) {
                return words.append("ноль").toString(); //исключительный случай
            }

            int segment1_999 = (int)(num%1000);    //текущий трехзначный сегмент
            int thousand = segment1_999/100;              //цифра сотен

            if (thousand>0) {
                words.append(digNames100_900[thousand-1]).append(" ");
            }

            int segment1_99 = segment1_999%100;
            int ten = segment1_99/10;                   //цифра десятков
            int one = segment1_99%10;              //цифра единиц

            switch(ten) {
                case 0: break;
                case 1: words.append(digNames10_19[one]).append(" ");
                    break;
                default: words.append(digNames20_90[ten-2]).append(" ");
            }

            if (ten!=1) {
                if ((level == 2)){
                            words.append(digNames1_9[0][one - 1]).append(" ");
                }
                else {
                    switch (one) {
                        case 1:
                        case 2:
                            words.append(digNames1_9[1][one - 1]).append(" ");
                            break;
                        default:
                            words.append(digNames1_9[0][one - 1]).append(" ");
                    }
                }

                if ((level > 1)) {
                    switch(one) {
                        case 1:
                            words.append(digNames1k_1m[level-2][0]);
                            break;
                        case 2:
                        case 3:
                        case 4:
                            words.append(digNames1k_1m[level-2][1]);
                            break;
                        default:
                            words.append(digNames1k_1m[level - 2][2]);
                    }
                }
            }else{
                if ((level > 1)) {words.append(digNames1k_1m[level - 2][2]);}
            }

            long nextSegment = num/1000;

            if(nextSegment>0) {
                result = (num2words(nextSegment, level + 1) + " " + words.toString()).trim();
            } else {
                result = words.toString().trim();
            }
            return result;
        }

         public static String getWordsUsingNumber(long num) {

            if (num<1000000000000000L) {
                if (num<0.0){
                    return "(минус) "+num2words(Math.abs(num), 1);
                }
                return num2words(num, 1) ;
            } else
                return "error: слишком большое число";
        }
}
