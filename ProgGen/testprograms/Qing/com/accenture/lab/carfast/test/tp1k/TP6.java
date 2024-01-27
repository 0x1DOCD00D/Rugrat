package com.accenture.lab.carfast.test.tp1k;


public class TP6 implements TPInterface1 {


public int TPInterface1Method0(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11){
 for(int i = 0; i < 0; i++){
 if( ((var7+(int)(44))!=(var1*var8))){
System.out.println("TP6 - TPInterface1Method0- LineInMethod: 4");
}
}
return (int)var1;

}

public int TPInterface1Method1(int var0, int var1, int var2, int var3, int var4){
 for(int i = 0; i < 2; i++){
 if( ((var2-var0)!=(var1-var4))){
System.out.println("TP6 - TPInterface1Method1- LineInMethod: 4");
}
}
return (int)var0;

}

public int TPInterface1Method2(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8){
 if( ((var7*var1)>=(((var2*var3)+(var3+var0))+(var1+var4)))){
TPInterface1Method3(var4,var2,var2,var0,var7,var7,var7);}
return (int)var3;

}

public int TPInterface1Method3(int var0, int var1, int var2, int var3, int var4, int var5, int var6){
 if( ((var0/(int)(45))<=((var3+var1)%(int)(17)))){
if( ((var2+var5)>((var2+var6)%(int)(76)))){
var1 = (int)((var5/(int)(33))+(var2-var0));
}
}
return (int)var4;

}

public int TPInterface1Method4(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7){
 if( ((var0+var7)<=(var3-var2))){
if( ((((var0*var3)<(var7*var6))&&((var0-var5)!=((var5+var0)-(var7%(int)(69)))))&&((var7%(int)(21))<(var4-var6)))){
if( ((((((var4+var7)>(var3-var2))&&((var5/(int)(33))<(var1+var3)))||((var6%(int)(24))!=(var5*var4)))&&((var4*var6)==(var1*var0)))||((((var5/(int)(35))+((((var3-var6)/(int)(4))*(var1*var3))+(var6+var5)))/(int)(28))<=(var6/(int)(55))))){
if( ((var3*var5)==(var7-var1))){
if( ((var7+var0)<=(var2*var7))){
var6 = (int)((var1*var3)+(var6+var5));
}
}
}
}
}
return (int)var1;

}

public int TP6method0(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8){
 for(int i = 0; i < 0; i++){
 if( ((var1-var7)==(var3-var8))){
if( ((var4*var8)!=(var0%(int)(8)))){
if( ((var3*(int)(14))<=(var1*var3))){
var2 = (int)(((var5*var1)+(var2+var5))+((var7/(int)(62))+(var7+var3)));
}
}
}
}
return (int)var6;

}

public static int TP6method1(int var0, int var1, int var2, int var3, int var4, int var5, int var6){
 if( ((var2-var6)>=(var6*var0))){
var2 = (int)(29);
}
for(int i = 0; i < 1; i++){
 if( ((((var5%(int)(27))*((var1+var6)/(int)(47)))+(var4-var6))>(var0*var3))){
if( (((var0+var5)==(var1*var5))&&(((var6-(int)(25))<=(var5-var0))||((var4+var3)==(var5*var4))))){
if( ((var3/(int)(51))>((var1-var3)-(var5*var2)))){
if( ((((var4%(int)(50))<(var6*var5))&&((var2+var0)>(var6/(int)(64))))&&((var1-var5)<(var6*var3)))){
if( ((var1*var0)<=(((var6/(int)(35))*(var4+var5))+(var1*var4)))){
if( ((var4+var3)<(var6-var1))){
System.out.println("TP6 - TP6method1- LineInMethod: 16");
}
}
}
}
}
}
}
return (int)var5;

}

public int TP6method2(int var0, int var1, int var2, int var3, int var4){
 switch(((var2-var3)*((var1*var4)/(int)(3)))){
case 0:
System.out.println("TP6 - TP6method2- LineInMethod: 2");
 break;
case 1:
System.out.println("TP6 - TP6method2- LineInMethod: 5");
 break;
case 2:
var2 = (int)(5);
 break;
default :
System.out.println("TP6 - TP6method2- LineInMethod: 11");
}
return (int)var2;

}


public static void main(String args[]){
TP6 obj = new TP6();
obj.TPInterface1Method0((int)(36),(int)(32),(int)(72),(int)(23),(int)(18),(int)(73),(int)(68),(int)(46),(int)(71),(int)(2),(int)(2),(int)(43));
obj.TPInterface1Method1((int)(8),(int)(19),(int)(40),(int)(17),(int)(59));
obj.TPInterface1Method2((int)(32),(int)(61),(int)(69),(int)(66),(int)(50),(int)(30),(int)(69),(int)(74),(int)(58));
obj.TPInterface1Method3((int)(10),(int)(24),(int)(63),(int)(9),(int)(52),(int)(49),(int)(51));
obj.TPInterface1Method4((int)(66),(int)(0),(int)(74),(int)(68),(int)(50),(int)(40),(int)(72),(int)(63));
obj.TP6method0((int)(60),(int)(40),(int)(29),(int)(58),(int)(12),(int)(39),(int)(25),(int)(50),(int)(67));
TP6method1((int)(36),(int)(44),(int)(6),(int)(63),(int)(14),(int)(11),(int)(32));
obj.TP6method2((int)(61),(int)(40),(int)(65),(int)(26),(int)(11));
}

public static void singleEntry(int i0,int i1,int i2,int i3,int i4,int i5,int i6,int i7,int i8,int i9,int i10,int i11,int i12,int i13,int i14){
TP6 obj = new TP6();
obj.TPInterface1Method0(i13,i4,i11,i7,i12,i14,i9,i5,i6,i8,i2,i3);
obj.TPInterface1Method1(i7,i5,i9,i3,i1);
obj.TPInterface1Method2(i11,i2,i13,i9,i12,i0,i3,i14,i1);
obj.TPInterface1Method3(i6,i8,i2,i3,i7,i10,i14);
obj.TPInterface1Method4(i12,i8,i4,i10,i1,i14,i0,i9);
obj.TP6method0(i2,i12,i4,i9,i10,i5,i3,i1,i0);
TP6method1(i6,i14,i4,i9,i1,i3,i12);
obj.TP6method2(i5,i2,i6,i13,i11);
}

}