package com.accenture.lab.carfast.test.tp5k;


public class TP28 {


public int TP28method0(int var0, int var1, int var2, int var3, int var4, int var5, int var6){
 switch((var5+(int)(17))){
case 0:
System.out.println("TP28 - TP28method0- LineInMethod: 2");
 break;
case 1:
var0 = (int)((var0-var1)*(var1%(int)(20)));
 break;
default :
TP28method2(var6,var1,var2,var4,var6);}
if(((var1-var5)==(var6*var5))){
TP28method3(var3,var5,var3,var1,var5);}
else{
 System.out.println("TP28 - TP28method0- LineInMethod: 14");
}
for(int i = 0; i < 3; i++){
 var5 = (int)((var1+var3)+(var5*var0));
}
if(((((var6/(int)(19))%(int)(32))!=(var5*var6))||((var1*var6)<(var2/(int)(21))))){
TP28method3(var0,var2,var1,var4,var0);}
else{
 var2 = TP28method2(var2,var5,var2,var3,var0);
}
return (int)var3;

}

public static int TP28method1(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12){
 switch((var8%(int)(10))){
case 0:
var7 = (int)(var12-(int)(43));
 break;
case 1:
TP28method3(var9,var12,var9,var10,var2); break;
case 2:
System.out.println("TP28 - TP28method1- LineInMethod: 8");
 break;
case 3:
var10 = TP28method3(var7,var3,var5,var5,var3);
 break;
default :
var12 = (int)((((var2*var11)-(((var2+(int)(55))-(var10+var7))%(int)(39)))-(var11*var1))*(var0+var4));
}
for(int i = 0; i < 3; i++){
 var7 = (int)(var9-var4);
}
switch((var0-(int)(39))){
case 0:
var11 = (int)((var9-var11)-(var11-(int)(60)));
 break;
case 1:
var6 = (int)((var1*var3)+(var3-var2));
 break;
case 2:
var4 = (int)((var10-var3)*(var12-var11));
 break;
case 3:
TP28method3(var3,var6,var1,var6,var0); break;
default :
TP28method2(var0,var11,var11,var5,var8);}
return (int)var5;

}

public static int TP28method2(int var0, int var1, int var2, int var3, int var4){
 switch((var0+var4)){
case 0:
var4 = (int)((((var0*var4)-(var3-var2))*(var4-(int)(76)))%(int)(31));
 break;
case 1:
System.out.println("TP28 - TP28method2- LineInMethod: 5");
 break;
case 2:
TP28method3(var1,var2,var2,var3,var1); break;
default :
var0 = (int)(var1/(int)(12));
}
switch((var2-(int)(69))){
case 0:
var4 = (int)((var1*var4)/(int)(55));
 break;
case 1:
var3 = (int)(62);
 break;
case 2:
System.out.println("TP28 - TP28method2- LineInMethod: 22");
 break;
case 3:
var2 = (int)((var0+var2)+(var1/(int)(48)));
 break;
default :
var2 = (int)(75);
}
return (int)var1;

}

public static int TP28method3(int var0, int var1, int var2, int var3, int var4){
 for(int i = 0; i < 1; i++){
 System.out.println("TP28 - TP28method3- LineInMethod: 2");
}
if( ((var3+var1)<((var1+var2)/(int)(15)))){
if( (((var2+var4)!=(var0+(int)(75)))&&((var1/(int)(67))!=(var4+var3)))){
System.out.println("TP28 - TP28method3- LineInMethod: 7");
}
}
switch((((var3+var2)%(int)(30))-(var1+var3))){
case 0:
System.out.println("TP28 - TP28method3- LineInMethod: 13");
 break;
case 1:
System.out.println("TP28 - TP28method3- LineInMethod: 18");
 break;
case 2:
System.out.println("TP28 - TP28method3- LineInMethod: 23");
 break;
case 3:
var4 = (int)((var3-var2)/(int)(16));
 break;
case 4:
var4 = (int)(16);
 break;
case 5:
var0 = (int)((var4-var3)+(var3-var1));
 break;
case 6:
var4 = (int)((((var2-var3)*(var0-var4))-(var2+var4))+(var0-var2));
 break;
case 7:
System.out.println("TP28 - TP28method3- LineInMethod: 38");
 break;
default :
var3 = (int)((var1/(int)(16))+(var0*var1));
}
return (int)var1;

}


public static void main(String args[]){
TP28 obj = new TP28();
obj.TP28method0((int)(29),(int)(53),(int)(12),(int)(49),(int)(64),(int)(26),(int)(18));
TP28method1((int)(68),(int)(72),(int)(74),(int)(11),(int)(18),(int)(37),(int)(39),(int)(0),(int)(8),(int)(16),(int)(33),(int)(53),(int)(29));
TP28method2((int)(75),(int)(46),(int)(10),(int)(23),(int)(72));
TP28method3((int)(21),(int)(63),(int)(66),(int)(5),(int)(66));
}

public static void singleEntry(int i0,int i1,int i2,int i3,int i4,int i5,int i6,int i7,int i8,int i9,int i10,int i11,int i12,int i13,int i14){
TP28 obj = new TP28();
obj.TP28method0(i14,i12,i7,i3,i11,i1,i0);
TP28method1(i6,i8,i2,i0,i1,i12,i14,i5,i4,i9,i13,i10,i3);
TP28method2(i7,i1,i9,i3,i10);
TP28method3(i13,i7,i6,i9,i5);
}

}