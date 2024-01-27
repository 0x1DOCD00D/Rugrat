package com.accenture.lab.carfast.test.tp2k;


public class TP5 extends TP4 {


public int TP5method0(int var0, int var1, int var2, int var3){
 if((((var2%(int)(13))-(var0*var3))>(var3/(int)(12)))){
var0 = (int)(43);
}
else{
 var3 = (int)((var0-var1)+(var3/(int)(21)));
}
switch((var3/(int)(15))){
case 0:
var3 = (int)(37);
 break;
case 1:
System.out.println("TP5 - TP5method0- LineInMethod: 9");
 break;
case 2:
System.out.println("TP5 - TP5method0- LineInMethod: 16");
 break;
case 3:
System.out.println("TP5 - TP5method0- LineInMethod: 19");
 break;
case 4:
System.out.println("TP5 - TP5method0- LineInMethod: 24");
 break;
case 5:
System.out.println("TP5 - TP5method0- LineInMethod: 27");
 break;
case 6:
var1 = (int)(((var2+var0)/(int)(15))+(((var2-var1)-(var1-var3))*(var0*(int)(10))));
 break;
case 7:
var3 = (int)((var3%(int)(37))+(var1*var3));
 break;
default :
var0 = (int)((var2*(int)(48))%(int)(39));
}
return (int)var0;

}

public int TP4method0(int var0, int var1, int var2, int var3){
 if( ((((var3+var2)>=(var3%(int)(41)))&&(((var0*var3)>=(var3%(int)(43)))||((var3/(int)(5))<=(var2*var1))))&&((((var3-var1)/(int)(27))*(var0+var2))>=(var2*var3)))){
var3 = (int)(((var0*var2)*(var2*var3))*(var1+var0));
}
for(int i = 0; i < 3; i++){
 var1 = (int)((var0*var1)*(var2*(int)(23)));
}
if(((var3%(int)(44))<(var1-(int)(49)))){
var0 = (int)((var3%(int)(3))-(var2*var3));
}
else{
 System.out.println("TP5 - TP4method0- LineInMethod: 11");
}
return (int)var3;

}

public static int TP5method2(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11){
 switch(((var3%(int)(21))%(int)(4))){
case 0:
var8 = (int)((var3/(int)(25))-(var7/(int)(2)));
 break;
case 1:
var7 = (int)(22);
 break;
case 2:
System.out.println("TP5 - TP5method2- LineInMethod: 7");
 break;
case 3:
System.out.println("TP5 - TP5method2- LineInMethod: 14");
 break;
case 4:
var7 = (int)(((var1+var3)-(var7%(int)(43)))/(int)(37));
 break;
case 5:
var7 = (int)(41);
 break;
case 6:
System.out.println("TP5 - TP5method2- LineInMethod: 24");
 break;
case 7:
System.out.println("TP5 - TP5method2- LineInMethod: 31");
 break;
case 8:
var1 = (int)((var10*var11)/(int)(6));
 break;
default :
var6 = (int)(((var10+var11)%(int)(15))-(var6/(int)(32)));
}
return (int)var11;

}

public int TP4method2(int var0, int var1, int var2, int var3){
 switch((var0*var2)){
case 0:
var2 = (int)((var3*(int)(36))+(var0-var1));
 break;
case 1:
var3 = (int)((var3*var1)-(var0+var2));
 break;
case 2:
System.out.println("TP5 - TP4method2- LineInMethod: 8");
 break;
case 3:
System.out.println("TP5 - TP4method2- LineInMethod: 13");
 break;
case 4:
System.out.println("TP5 - TP4method2- LineInMethod: 18");
 break;
case 5:
System.out.println("TP5 - TP4method2- LineInMethod: 23");
 break;
default :
System.out.println("TP5 - TP4method2- LineInMethod: 30");
}
return (int)var1;

}


public static void main(String args[]){
TP5 obj = new TP5();
obj.TP5method0((int)(42),(int)(0),(int)(38),(int)(38));
obj.TP4method0((int)(20),(int)(28),(int)(43),(int)(21));
TP5method2((int)(18),(int)(0),(int)(45),(int)(28),(int)(40),(int)(32),(int)(32),(int)(40),(int)(24),(int)(4),(int)(31),(int)(46));
obj.TP4method2((int)(27),(int)(48),(int)(1),(int)(43));
}

public static void singleEntry(int i0,int i1,int i2,int i3,int i4,int i5,int i6,int i7,int i8,int i9,int i10,int i11,int i12,int i13,int i14){
TP5 obj = new TP5();
obj.TP5method0(i5,i11,i0,i4);
obj.TP4method0(i0,i10,i1,i8);
TP5method2(i1,i7,i0,i6,i10,i3,i4,i11,i13,i2,i9,i8);
obj.TP4method2(i7,i11,i14,i8);
}

}