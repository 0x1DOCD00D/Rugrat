package com.accenture.lab.carfast.test.tp1k;


public class TP5 extends TP13 {


public int TP1method2(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7){
 if(((var5*var4)<(var0-var7))){
var0 = (int)((var4*(int)(66))%(int)(26));
}
else{
 System.out.println("TP5 - TP1method2- LineInMethod: 5");
}
if( (((var7%(int)(72))>=((var6/(int)(3))-((var4-var2)-(((var4*var3)-(var7*var6))%(int)(23)))))&&((var2+var7)!=(var0+var7)))){
if( ((var7%(int)(28))>=(var2-var5))){
if( ((((var2-var1)*(var5*var6))==(var1-var6))&&((var4*var7)>=(var3%(int)(8))))){
if( (((var3+var5)<((var7*var1)*(var1+var4)))&&((var1+var7)>((var5+var4)*((var6%(int)(10))+(var4-var5)))))){
var1 = (int)((var1*var4)-((var4+var7)%(int)(17)));
}
}
}
}
return (int)var2;

}

public static int TP5method1(int var0, int var1, int var2, int var3, int var4){
 for(int i = 0; i < 0; i++){
 if( ((var2*(int)(1))==(var4+var1))){
var2 = (int)(68);
}
}
switch((var3+(int)(14))){
case 0:
System.out.println("TP5 - TP5method1- LineInMethod: 6");
 break;
case 1:
var4 = (int)((var4%(int)(23))+((var2*(int)(16))/(int)(48)));
 break;
case 2:
System.out.println("TP5 - TP5method1- LineInMethod: 15");
 break;
default :
var3 = (int)((var3-(int)(39))*(var1+var0));
}
return (int)var0;

}

public int TP1method0(int var0, int var1, int var2, int var3, int var4){
 for(int i = 0; i < 4; i++){
 var3 = (int)(var1*(int)(76));
}
if(((var0%(int)(5))==(((var2+var0)-((var3/(int)(44))*(((var0-var2)*(((var3+var0)+(var0%(int)(37)))*(var3+var2)))%(int)(47))))-(var4-(int)(34))))){
TP5method1(var3,var1,var3,var0,var1);}
else{
 var4 = (int)(var2*var4);
}
return (int)var1;

}


public static void main(String args[]){
TP5 obj = new TP5();
obj.TP1method2((int)(41),(int)(76),(int)(11),(int)(11),(int)(14),(int)(7),(int)(41),(int)(2));
TP5method1((int)(69),(int)(72),(int)(20),(int)(60),(int)(73));
obj.TP1method0((int)(17),(int)(20),(int)(23),(int)(23),(int)(14));
}

public static void singleEntry(int i0,int i1,int i2,int i3,int i4,int i5,int i6,int i7,int i8,int i9,int i10,int i11,int i12,int i13,int i14){
TP5 obj = new TP5();
obj.TP1method2(i5,i2,i12,i4,i3,i8,i1,i7);
TP5method1(i14,i2,i13,i10,i3);
obj.TP1method0(i3,i10,i5,i2,i9);
}

}