
import java.util.Random;
import java.util.Scanner;

public class Main {

	 public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);
	  int Ren = 0;
	  System.out.println("����񂯂��15�A���ł�����1000���~�v���[���g!");

	  for(int i = 0 ; i < 15 ; i++){
	        System.out.println("����񂯂�");
	        System.out.println("�u�O�[�v�u�`���L�v�u�p�[�v");
	        String Hoi = scanner.next();
	        
	        String resolt = janken(Hoi);

	        System.out.println(resolt);
	        if(resolt.equals("����")){
	           System.out.println("���Ȃ��̕����ł��B�Q�[���I�[�o�[�B");
	           break;
	        }else if(resolt.equals("����")){
	           System.out.println("���Ȃ��̏���!���߂łƂ�!");
	           Ren += 1;
	           if(Ren < 15){
	              System.out.println("����"+Ren+"�A������!1000���~�܂ł���"+(15-Ren)+"���ł�!");
	              System.out.println();
	           }else{
	           System.out.println("���߂łƂ��I1000���~�l����!!");
	           }
           }else if(resolt.equals("������")){
	           System.out.println("�������ł��B������x�I�����Ă��������B");
	           System.out.println();
	           i -= 1;
	           continue;
	        }else{
	           System.out.println("�I���������ł��B");
	           System.out.println("�u�O�[�v�u�`���L�v�u�p�[�v����I�����Ă�������");
	           System.out.println();
	           i -= 1;
	           continue;
	        }
	       
	  }
	  scanner.close();
	 }
	 
	 public static String janken (String Hoi){
	   String Hoi2 = Hoi;
	   String enemyHoi = enemyHoi();
	   String resolt= "";

	   if(Hoi2.equals("�O�[")){
	     switch(enemyHoi){
	      case "�O�[":
	        resolt = "������";
	        break;
	      case "�`���L":
	        resolt = "����";
	        break;
	      case "�p�[":
	        resolt = "����";
	        break;
	     }
	   }else if(Hoi2.equals("�`���L")){
	     switch(enemyHoi){
	      case "�O�[":
	        resolt = "����";
	        break;
	      case "�`���L":
	        resolt = "������";
	        break;
	      case "�p�[":
	        resolt = "����";
	        break;
	     }
	   }else if(Hoi2.equals("�p�[")){
	     switch(enemyHoi){
	      case "�O�[":
	        resolt = "����";
	        break;
	      case "�`���L":
	        resolt = "����";
	        break;
	      case "�p�[":
	        resolt = "������";
	        break;
	     }
	   }else {
		   resolt = "";
	   }
	     return resolt;
	 }
	 
	 public static String enemyHoi(){
	   Random rand = new Random();
	   int num = rand.nextInt(3);
	   String enemyHoi= "";
	   switch(num){
	     case 0:
	       enemyHoi = "�O�[";
	       break;
	     case 1:
	       enemyHoi = "�`���L";
	       break;
	     case 2:
	       enemyHoi = "�p�[";
	       break;
	    }
	   return enemyHoi;
	 }
	}

