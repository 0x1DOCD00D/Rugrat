package com.accenture.lab.carfast.test.tp5k;


public class TP22 {


public int TP22method0(int var0, int var1, int var2, int var3, int var4){
 if((((var2/(int)(18))/(int)(36))<=(var3+(int)(19)))){
var1 = (int)(var0-var3);
}
else{
 System.out.println("TP22 - TP22method0- LineInMethod: 5");
}
if((((var3-var4)<=(var3*var0))&&(((var1-var0)>(((var4-var2)*(var2-var0))+(var2-(int)(18))))&&((((var0-var3)>=(var3+var2))||((var1*var2)!=(var4+var1)))&&((var4-var2)!=(var2*var4)))))){
var1 = (int)(var1*var0);
}
else{
 var3 = TP22method1(var0,var1,var0,var0,var1,var1);
}
if(((var1-var4)>=(((var0/(int)(21))/(int)(33))/(int)(32)))){
var1 = (int)(var2%(int)(35));
}
else{
 System.out.println("TP22 - TP22method0- LineInMethod: 17");
}
if( ((var2%(int)(5))>=(var3-(int)(28)))){
if( ((((var2-var0)<((var0*(int)(13))+(var2-(int)(27))))&&((var4/(int)(55))<=(var0-var1)))&&((var2*var1)>=(var1*var2)))){
if( ((var4-var2)<(var3*(int)(36)))){
TP22method3(var0,var0,var3,var2,var1,var2,var0,var0,var0);}
}
}
return (int)var1;

}

public static int TP22method1(int var0, int var1, int var2, int var3, int var4, int var5){
 if( (((var0+var2)+(var2*var1))>(var0-var5))){
if( ((var3+var1)==((var4+var0)%(int)(18)))){
System.out.println("TP22 - TP22method1- LineInMethod: 4");
}
}
if((((var2/(int)(67))<=(var1*var0))&&((var1*var2)<(var2-var5)))){
var5 = (int)(4);
}
else{
 var3 = (int)((var1+var5)/(int)(70));
}
if((((var1/(int)(29))/(int)(6))<(var3-var0))){
System.out.println("TP22 - TP22method1- LineInMethod: 18");
}
else{
 System.out.println("TP22 - TP22method1- LineInMethod: 20");
}
if(((var0+var4)==(var4-var3))){
System.out.println("TP22 - TP22method1- LineInMethod: 26");
}
else{
 var0 = (int)((((var3/(int)(48))%(int)(66))*(var2+var0))/(int)(17));
}
return (int)var2;

}

public int TP22method2(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7){
 switch((var3*(int)(21))){
case 0:
System.out.println("TP22 - TP22method2- LineInMethod: 2");
 break;
case 1:
var1 = (int)((var5*var7)%(int)(72));
 break;
case 2:
var5 = (int)((var4-var3)+(var7*var5));
 break;
default :
System.out.println("TP22 - TP22method2- LineInMethod: 14");
}
if(((var7/(int)(32))!=(var2-var3))){
System.out.println("TP22 - TP22method2- LineInMethod: 23");
}
else{
 TP22method3(var6,var6,var7,var0,var2,var3,var0,var1,var5);}
return (int)var7;

}

public int TP22method3(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8){
 switch((var7%(int)(55))){
case 0:
System.out.println("TP22 - TP22method3- LineInMethod: 2");
 break;
case 1:
System.out.println("TP22 - TP22method3- LineInMethod: 7");
 break;
case 2:
var3 = (int)(16);
 break;
case 3:
System.out.println("TP22 - TP22method3- LineInMethod: 15");
 break;
default :
System.out.println("TP22 - TP22method3- LineInMethod: 22");
}
return (int)var8;

}


public static void main(String args[]){
TP22 obj = new TP22();
obj.TP22method0((int)(20),(int)(41),(int)(48),(int)(46),(int)(72));
TP22method1((int)(38),(int)(70),(int)(52),(int)(41),(int)(69),(int)(51));
obj.TP22method2((int)(71),(int)(54),(int)(34),(int)(23),(int)(43),(int)(19),(int)(52),(int)(66));
obj.TP22method3((int)(60),(int)(48),(int)(54),(int)(40),(int)(58),(int)(64),(int)(74),(int)(40),(int)(27));
}

public static void singleEntry(int i0,int i1,int i2,int i3,int i4,int i5,int i6,int i7,int i8,int i9,int i10,int i11,int i12,int i13,int i14){
TP22 obj = new TP22();
obj.TP22method0(i9,i4,i11,i7,i6);
TP22method1(i9,i1,i5,i11,i3,i8);
obj.TP22method2(i6,i1,i5,i11,i3,i9,i8,i2);
obj.TP22method3(i4,i8,i10,i1,i6,i7,i9,i11,i14);
}

}