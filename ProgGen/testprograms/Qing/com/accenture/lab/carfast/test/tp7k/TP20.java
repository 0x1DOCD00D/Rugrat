package com.accenture.lab.carfast.test.tp7k;


public class TP20 extends TP22 implements TPInterface1 {


public int TPInterface1Method0(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9){
 for(int i = 0; i < 3; i++){
 System.out.println("TP20 - TPInterface1Method0- LineInMethod: 2");
}
switch((var5+(int)(26))){
case 0:
var0 = (int)(17);
 break;
case 1:
var3 = (int)((var3-var1)*(var8*var0));
 break;
case 2:
System.out.println("TP20 - TPInterface1Method0- LineInMethod: 13");
 break;
case 3:
var7 = (int)(var6*var2);
 break;
case 4:
var2 = (int)(18);
 break;
case 5:
System.out.println("TP20 - TPInterface1Method0- LineInMethod: 23");
 break;
default :
var5 = (int)(17);
}
for(int i = 0; i < 1; i++){
 var0 = (int)(((var1%(int)(18))+(var7*var1))-(var0*(int)(4)));
}
if(((var4%(int)(10))!=(var8*var9))){
System.out.println("TP20 - TPInterface1Method0- LineInMethod: 36");
}
else{
 System.out.println("TP20 - TPInterface1Method0- LineInMethod: 37");
}
return (int)var4;

}

public int TP20method0(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11){
 if( ((var10/(int)(2))<=(var11-var4))){
var5 = (int)((var10/(int)(1))+(var3-var7));
}
if( ((var5*var11)==(var2-var0))){
if( ((var9+var3)<(var2-var9))){
var7 = (int)((var0+var3)+(var10*var3));
}
}
if( ((var3*var0)!=(var0%(int)(16)))){
System.out.println("TP20 - TP20method0- LineInMethod: 10");
}
if( ((var7/(int)(2))!=(var2%(int)(20)))){
if( (((var3+var4)-(var9*var8))<=(var9%(int)(42)))){
if( ((var10*var3)>(var6-var4))){
if( ((((((var4/(int)(19))/(int)(35))/(int)(8))<(var4*var11))||(((var4%(int)(2))%(int)(48))>=((var3*var7)-(((var3+var5)%(int)(36))-(var4*var0)))))&&(((var9*var4)>=(var2+var11))&&(((((var4*var7)<=(var3+var9))&&((var3+var0)>(var10*var7)))||((var6*var5)<=(var7+var5)))||((var10*var3)>(var1+var2)))))){
if( ((var4-var3)<=(var9+var5))){
var2 = (int)((var10*var7)-(var5-var4));
}
}
}
}
}
if( ((var4-var5)<((var3%(int)(8))%(int)(48)))){
System.out.println("TP20 - TP20method0- LineInMethod: 24");
}
if(((var6+var5)<=(var2*var7))){
var10 = (int)(48);
}
else{
 System.out.println("TP20 - TP20method0- LineInMethod: 32");
}
return (int)var3;

}

public static int TP20method1(int var0, int var1, int var2, int var3, int var4){
 switch((var1-(int)(32))){
case 0:
System.out.println("TP20 - TP20method1- LineInMethod: 2");
 break;
case 1:
var2 = (int)((var4%(int)(15))-(var3-var4));
 break;
case 2:
var2 = (int)((var3-(int)(22))+(var2+var3));
 break;
case 3:
var3 = (int)((var1/(int)(35))-(var1-(int)(11)));
 break;
case 4:
var1 = (int)(23);
 break;
case 5:
var2 = (int)(26);
 break;
case 6:
var4 = (int)(16);
 break;
case 7:
var4 = (int)(18);
 break;
default :
System.out.println("TP20 - TP20method1- LineInMethod: 26");
}
if( ((var1-(int)(27))>=(((((var1-var2)-((var1/(int)(3))%(int)(20)))*((var2-var3)*((var0%(int)(20))%(int)(20))))-((var2/(int)(43))-(var2+var1)))+(var1-var3)))){
if( ((var0*var1)<=(var3-(int)(36)))){
if( ((var2/(int)(33))<=(var2-(int)(21)))){
if( ((var1*(int)(21))>(var0/(int)(4)))){
if( ((var0*var2)>=((var3/(int)(36))%(int)(21)))){
if( ((((var4/(int)(36))<(var4-var0))&&(((var0+(int)(2))<=(var4*var0))&&((var3/(int)(36))==(var3+var4))))||((var1*var2)<(var0*var2)))){
System.out.println("TP20 - TP20method1- LineInMethod: 43");
}
}
}
}
}
}
return (int)var2;

}


public static void main(String args[]){
TP20 obj = new TP20();
obj.TPInterface1Method0((int)(11),(int)(32),(int)(33),(int)(27),(int)(3),(int)(7),(int)(13),(int)(10),(int)(35),(int)(48));
obj.TP20method0((int)(20),(int)(18),(int)(4),(int)(34),(int)(23),(int)(9),(int)(24),(int)(38),(int)(17),(int)(22),(int)(45),(int)(8));
TP20method1((int)(22),(int)(16),(int)(26),(int)(21),(int)(35));
}

public static void singleEntry(int i0,int i1,int i2,int i3,int i4,int i5,int i6,int i7,int i8,int i9,int i10,int i11,int i12,int i13,int i14){
TP20 obj = new TP20();
obj.TPInterface1Method0(i10,i3,i7,i8,i5,i14,i6,i4,i13,i1);
obj.TP20method0(i6,i5,i4,i12,i3,i2,i9,i1,i14,i11,i0,i8);
TP20method1(i7,i4,i12,i13,i10);
}

}