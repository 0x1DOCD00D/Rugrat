package com.accenture.lab.carfast.test.tp5k;


public class TP3 extends TP24 {


public int TP24method2(int var0, int var1, int var2, int var3, int var4, int var5, int var6){
 switch((var2*(int)(22))){
case 0:
var1 = (int)((var6/(int)(58))+(var3-var6));
 break;
case 1:
System.out.println("TP3 - TP24method2- LineInMethod: 5");
 break;
case 2:
var0 = (int)(var6+(int)(56));
 break;
case 3:
var4 = (int)(var1-(int)(12));
 break;
case 4:
var3 = (int)((var1-var6)*(var4*var2));
 break;
case 5:
var6 = (int)(var5%(int)(49));
 break;
case 6:
var3 = (int)((var6-var0)-(var5+var1));
 break;
default :
System.out.println("TP3 - TP24method2- LineInMethod: 26");
}
return (int)var4;

}

public static int TP6method0(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11){
 for(int i = 0; i < 2; i++){
 var9 = (int)((var10*var11)+(var6/(int)(68)));
}
for(int i = 0; i < 2; i++){
 var8 = (int)((var0*var3)*(var3*(int)(52)));
}
if( (((((var4%(int)(56))+(var9-var3))+(var5*var7))<(var11%(int)(28)))&&((((var4*var6)/(int)(42))+(var9%(int)(1)))!=(var10*var6)))){
if( ((((var5-var9)>(var8+var6))||(((var3/(int)(43))*(var0+var4))==(var2+var1)))&&((var11/(int)(37))>=(var2-var11)))){
if( ((var7-var3)==(var7%(int)(31)))){
TP3method2(var6,var11,var1,var0,var10,var2,var2,var3);}
}
}
if( ((var0+var11)>(((var10+var0)+(var5*(int)(12)))/(int)(5)))){
if( (((var8+var6)*(var2/(int)(74)))>=(var9*var11))){
var6 = TP3method2(var8,var10,var10,var5,var4,var6,var7,var0);
}
}
switch((var6+(int)(35))){
case 0:
System.out.println("TP3 - TP6method0- LineInMethod: 20");
 break;
case 1:
var11 = (int)(var7%(int)(14));
 break;
case 2:
var2 = (int)(var8+var11);
 break;
default :
System.out.println("TP3 - TP6method0- LineInMethod: 30");
}
return (int)var8;

}

public static int TP3method2(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7){
 for(int i = 0; i < 0; i++){
 var7 = (int)(38);
}
for(int i = 0; i < 1; i++){
 var5 = (int)((var1/(int)(28))%(int)(60));
}
if(((var3-var2)>(var4+var7))){
System.out.println("TP3 - TP3method2- LineInMethod: 9");
}
else{
 System.out.println("TP3 - TP3method2- LineInMethod: 13");
}
switch((var6%(int)(46))){
case 0:
var0 = (int)(((var2*var6)*((var5/(int)(66))*(var2/(int)(45))))+(var3*var4));
 break;
case 1:
var5 = (int)(((var0/(int)(56))-(var7/(int)(23)))*(var3*var4));
 break;
case 2:
System.out.println("TP3 - TP3method2- LineInMethod: 24");
 break;
case 3:
var2 = (int)((var6*(int)(20))*(var0/(int)(38)));
 break;
case 4:
var4 = (int)((var5/(int)(40))+((var3*var1)*((var5*var3)*(var6%(int)(26)))));
 break;
default :
System.out.println("TP3 - TP3method2- LineInMethod: 36");
}
return (int)var2;

}

public int TP6method3(int var0, int var1, int var2, int var3, int var4){
 switch((var1-var3)){
case 0:
System.out.println("TP3 - TP6method3- LineInMethod: 2");
 break;
case 1:
var3 = (int)(5);
 break;
case 2:
var3 = (int)(14);
 break;
case 3:
var1 = (int)((var2*var3)+(var3+(int)(18)));
 break;
default :
var2 = (int)(76);
}
for(int i = 0; i < 4; i++){
 var3 = (int)(45);
}
for(int i = 0; i < 2; i++){
 if( ((var1+(int)(16))<=((var2/(int)(44))*(var4/(int)(49))))){
if( (((var1*var4)*(var4+var2))>(var3+var2))){
if( (((var2*var3)%(int)(70))==(var2*var3))){
System.out.println("TP3 - TP6method3- LineInMethod: 24");
}
}
}
}
return (int)var3;

}


public static void main(String args[]){
TP3 obj = new TP3();
obj.TP24method2((int)(43),(int)(54),(int)(16),(int)(59),(int)(25),(int)(53),(int)(22));
TP6method0((int)(76),(int)(24),(int)(69),(int)(12),(int)(44),(int)(52),(int)(16),(int)(60),(int)(12),(int)(70),(int)(54),(int)(48));
TP3method2((int)(63),(int)(25),(int)(69),(int)(4),(int)(36),(int)(75),(int)(22),(int)(44));
obj.TP6method3((int)(43),(int)(1),(int)(12),(int)(61),(int)(27));
}

public static void singleEntry(int i0,int i1,int i2,int i3,int i4,int i5,int i6,int i7,int i8,int i9,int i10,int i11,int i12,int i13,int i14){
TP3 obj = new TP3();
obj.TP24method2(i0,i1,i11,i5,i6,i2,i7);
TP6method0(i6,i4,i2,i10,i3,i12,i1,i8,i13,i5,i9,i14);
TP3method2(i7,i14,i3,i6,i0,i1,i4,i5);
obj.TP6method3(i9,i13,i12,i2,i0);
}

}