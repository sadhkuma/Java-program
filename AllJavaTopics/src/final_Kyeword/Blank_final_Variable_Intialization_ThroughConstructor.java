package final_Kyeword;

// 3.program to initialize blank final variable
public class Blank_final_Variable_Intialization_ThroughConstructor {
    final int speedlimit;//blank final variable

    //we initialize blank final variable only in constructor
        Blank_final_Variable_Intialization_ThroughConstructor()
        {
            speedlimit=70;
            System.out.println(speedlimit);
        }

        public static void main(String args[]){
            new Blank_final_Variable_Intialization_ThroughConstructor();
        }
    }

