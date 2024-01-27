package com.accenture.lab.carfast.test.tp4k;


public class TP24 {


public static int TP24method0(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9){
 switch(((var8*var1)+(var7*var4))){
case 0:
System.out.println("TP24 - TP24method0- LineInMethod: 2");
 break;
case 1:
var6 = (int)(32);
 break;
case 2:
var5 = (int)(55);
 break;
case 3:
System.out.println("TP24 - TP24method0- LineInMethod: 12");
 break;
case 4:
var5 = (int)(53);
 break;
case 5:
System.out.println("TP24 - TP24method0- LineInMethod: 20");
 break;
case 6:
System.out.println("TP24 - TP24method0- LineInMethod: 25");
 break;
default :
System.out.println("TP24 - TP24method0- LineInMethod: 29");
}
switch((var2*var0)){
case 0:
System.out.println("TP24 - TP24method0- LineInMethod: 32");
 break;
case 1:
System.out.println("TP24 - TP24method0- LineInMethod: 39");
 break;
case 2:
System.out.println("TP24 - TP24method0- LineInMethod: 45");
 break;
case 3:
var1 = (int)((var4-var5)+(var4%(int)(12)));
 break;
case 4:
System.out.println("TP24 - TP24method0- LineInMethod: 54");
 break;
default :
System.out.println("TP24 - TP24method0- LineInMethod: 61");
}
return (int)var9;

}

public int TP24method1(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12){
 switch((var0-var10)){
case 0:
var2 = (int)((var11%(int)(33))*(var10-var3));
 break;
case 1:
System.out.println("TP24 - TP24method1- LineInMethod: 5");
 break;
case 2:
TP24method2(var2,var1,var4,var3,var8,var0,var2,var2,var7,var8,var4,var1,var6); break;
case 3:
var7 = (int)((var2+var12)*(var1/(int)(20)));
 break;
case 4:
System.out.println("TP24 - TP24method1- LineInMethod: 14");
 break;
case 5:
System.out.println("TP24 - TP24method1- LineInMethod: 17");
 break;
case 6:
System.out.println("TP24 - TP24method1- LineInMethod: 22");
 break;
default :
System.out.println("TP24 - TP24method1- LineInMethod: 25");
}
for(int i = 0; i < 3; i++){
 if( ((var12+var4)>(var6%(int)(28)))){
if( ((var4+var3)<((((var8*var12)-(var2*var5))+(var9*var6))-(var7-var11)))){
if( ((var5*var11)==(var0/(int)(2)))){
if( (((var5*var4)<=((var10+var3)-(var5*var8)))&&((var0+var10)==(var9-var1)))){
if( ((var6/(int)(64))<(var5*(int)(29)))){
if( ((var7/(int)(5))<=(var12+(int)(38)))){
TP24method2(var10,var1,var5,var11,var8,var11,var4,var12,var9,var2,var10,var3,var10);}
}
}
}
}
}
}
return (int)var9;

}

public int TP24method2(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12){
 if( (((var7%(int)(30))*(var10-var9))>(var3-var6))){
if( (((var1*var8)-(var8*var9))<((var3-var7)%(int)(11)))){
if( ((var11-var10)>=(var3*var0))){
if( ((var9-var2)>(var10+var9))){
if( ((var3-var1)<=(var10-var4))){
System.out.println("TP24 - TP24method2- LineInMethod: 10");
}
}
}
}
}
if( ((var8*var1)==(var11+var0))){
if( ((var11-(int)(16))==(var11-var8))){
var5 = (int)((var4/(int)(43))+(var9-var10));
}
}
if(((var12-var2)>=(var5+var3))){
System.out.println("TP24 - TP24method2- LineInMethod: 22");
}
else{
 var10 = (int)(((var7%(int)(72))%(int)(59))-(var10*var5));
}
if((((var4+var2)>=(var5/(int)(39)))||(((var3-var6)/(int)(16))<=(var5-var10)))){
var8 = (int)(((var7/(int)(75))-(var4-var7))-(var11%(int)(5)));
}
else{
 var8 = (int)(40);
}
return (int)var7;

}


public static void main(String args[]){
TP24 obj = new TP24();
TP24method0((int)(60),(int)(66),(int)(34),(int)(9),(int)(57),(int)(21),(int)(24),(int)(49),(int)(1),(int)(62));
obj.TP24method1((int)(56),(int)(48),(int)(24),(int)(25),(int)(67),(int)(44),(int)(39),(int)(25),(int)(4),(int)(74),(int)(59),(int)(40),(int)(71));
obj.TP24method2((int)(17),(int)(2),(int)(46),(int)(74),(int)(15),(int)(55),(int)(34),(int)(39),(int)(67),(int)(56),(int)(38),(int)(22),(int)(20));
}

public static void singleEntry(int i0,int i1,int i2,int i3,int i4,int i5,int i6,int i7,int i8,int i9,int i10,int i11,int i12,int i13,int i14){
TP24 obj = new TP24();
TP24method0(i12,i5,i2,i8,i7,i4,i0,i11,i3,i1);
obj.TP24method1(i3,i5,i14,i13,i4,i6,i0,i12,i7,i11,i8,i2,i10);
obj.TP24method2(i9,i3,i12,i11,i0,i8,i7,i13,i5,i4,i14,i2,i1);
}

}