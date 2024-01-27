package com.accenture.lab.carfast.test.tp1k;


public class TP10 extends TP8 {


public int TPInterface1Method2(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8){
 if(((var3-var0)==(var7+var2))){
System.out.println("TP10 - TPInterface1Method2- LineInMethod: 4");
}
else{
 System.out.println("TP10 - TPInterface1Method2- LineInMethod: 8");
}
return (int)var4;

}

public static int TP10method1(int var0, int var1, int var2, int var3, int var4){
 switch((var0-(int)(65))){
case 0:
System.out.println("TP10 - TP10method1- LineInMethod: 2");
 break;
case 1:
System.out.println("TP10 - TP10method1- LineInMethod: 9");
 break;
case 2:
var2 = (int)(37);
 break;
case 3:
var2 = (int)((var2*(int)(49))*(var4*var3));
 break;
case 4:
var2 = (int)((var4%(int)(4))-(var3-var1));
 break;
case 5:
System.out.println("TP10 - TP10method1- LineInMethod: 20");
 break;
case 6:
System.out.println("TP10 - TP10method1- LineInMethod: 24");
 break;
case 7:
System.out.println("TP10 - TP10method1- LineInMethod: 31");
 break;
case 8:
System.out.println("TP10 - TP10method1- LineInMethod: 38");
 break;
default :
var3 = (int)(((var0+var1)%(int)(48))+(var2-var1));
}
return (int)var4;

}

public int TP8method0(int var0, int var1, int var2, int var3, int var4){
 switch((var3-(int)(37))){
case 0:
var3 = TPInterface1Method2(var2,var1,var3,var1,var4,var4,var3,var4,var4);
 break;
case 1:
var0 = (int)((var4-var0)-(((var0/(int)(8))-(var0+var4))*(var0+var1)));
 break;
case 2:
var4 = TP10method1(var0,var2,var2,var4,var4);
 break;
case 3:
System.out.println("TP10 - TP8method0- LineInMethod: 11");
 break;
case 4:
System.out.println("TP10 - TP8method0- LineInMethod: 18");
 break;
case 5:
var1 = (int)((var2+(int)(58))+(((var1-var4)+(var1+var2))+(var3*var2)));
 break;
case 6:
System.out.println("TP10 - TP8method0- LineInMethod: 28");
 break;
case 7:
System.out.println("TP10 - TP8method0- LineInMethod: 34");
 break;
default :
System.out.println("TP10 - TP8method0- LineInMethod: 40");
}
return (int)var3;

}


public static void main(String args[]){
TP10 obj = new TP10();
obj.TPInterface1Method2((int)(41),(int)(4),(int)(25),(int)(11),(int)(61),(int)(14),(int)(23),(int)(45),(int)(46));
TP10method1((int)(2),(int)(67),(int)(58),(int)(69),(int)(7));
obj.TP8method0((int)(3),(int)(67),(int)(51),(int)(22),(int)(5));
}

public static void singleEntry(int i0,int i1,int i2,int i3,int i4,int i5,int i6,int i7,int i8,int i9,int i10,int i11,int i12,int i13,int i14){
TP10 obj = new TP10();
obj.TPInterface1Method2(i4,i3,i13,i2,i5,i11,i7,i6,i1);
TP10method1(i10,i5,i3,i11,i12);
obj.TP8method0(i8,i5,i9,i11,i1);
}

}