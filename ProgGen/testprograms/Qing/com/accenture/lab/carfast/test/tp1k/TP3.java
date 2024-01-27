package com.accenture.lab.carfast.test.tp1k;


public class TP3 {


public int TP3method0(int var0, int var1, int var2, int var3, int var4){
 switch(((var4/(int)(46))*(var1*var3))){
case 0:
System.out.println("TP3 - TP3method0- LineInMethod: 2");
 break;
case 1:
var0 = (int)(((var0+var4)/(int)(8))-(var0-var1));
 break;
default :
var3 = TP3method1(var4,var2,var1,var2,var2,var1);
}
return (int)var1;

}

public static int TP3method1(int var0, int var1, int var2, int var3, int var4, int var5){
 for(int i = 0; i < 4; i++){
 if( (((((var1-var4)*(var1-var0))*(var3*(int)(13)))*((var0+(int)(58))-((var2%(int)(64))%(int)(58))))>=(var4%(int)(1)))){
if( ((var4%(int)(59))<=(var0-var4))){
System.out.println("TP3 - TP3method1- LineInMethod: 6");
}
}
}
return (int)var3;

}

public static int TP3method2(int var0, int var1, int var2, int var3, int var4){
 if( (((var0*var4)<=(var0/(int)(76)))||(((var0%(int)(16))>=(var0+var1))&&((var2+var0)==(var2/(int)(47)))))){
System.out.println("TP3 - TP3method2- LineInMethod: 2");
}
for(int i = 0; i < 1; i++){
 var0 = (int)(var2*var3);
}
switch((var1%(int)(28))){
case 0:
var0 = (int)(var0/(int)(63));
 break;
case 1:
var2 = (int)((var4%(int)(9))+(var1*var2));
 break;
case 2:
var2 = (int)((var4+(int)(53))*(var2/(int)(68)));
 break;
case 3:
var2 = (int)((var3-var0)-(((var0+(int)(24))*(var0-var3))+((var0-var3)*(var2*var0))));
 break;
case 4:
System.out.println("TP3 - TP3method2- LineInMethod: 21");
 break;
case 5:
System.out.println("TP3 - TP3method2- LineInMethod: 28");
 break;
case 6:
var1 = (int)((var1*var3)*(var0+var3));
 break;
case 7:
var3 = (int)((var1-var3)/(int)(65));
 break;
case 8:
System.out.println("TP3 - TP3method2- LineInMethod: 38");
 break;
default :
var1 = (int)(var0*var3);
}
return (int)var1;

}


public static void main(String args[]){
TP3 obj = new TP3();
obj.TP3method0((int)(67),(int)(43),(int)(3),(int)(32),(int)(44));
TP3method1((int)(76),(int)(16),(int)(26),(int)(9),(int)(59),(int)(56));
TP3method2((int)(37),(int)(74),(int)(3),(int)(71),(int)(73));
}

public static void singleEntry(int i0,int i1,int i2,int i3,int i4,int i5,int i6,int i7,int i8,int i9,int i10,int i11,int i12,int i13,int i14){
TP3 obj = new TP3();
obj.TP3method0(i14,i8,i2,i9,i0);
TP3method1(i8,i12,i1,i2,i0,i5);
TP3method2(i7,i14,i6,i8,i1);
}

}