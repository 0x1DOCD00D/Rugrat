package com.accenture.lab.carfast.test.tp6k;


public class TP22 extends TP21 implements TPInterface1 {


public int TPInterface1Method0(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12){
 if( ((var4+var7)==(var11%(int)(20)))){
System.out.println("TP22 - TPInterface1Method0- LineInMethod: 2");
}
if( ((var7*var0)!=(var6-var11))){
System.out.println("TP22 - TPInterface1Method0- LineInMethod: 5");
}
if( (((var4+var5)<=(var9*var7))&&((var5+var3)!=((var10+var3)/(int)(8))))){
if( ((var3+var9)<(var6+(int)(4)))){
System.out.println("TP22 - TPInterface1Method0- LineInMethod: 13");
}
}
return (int)var11;

}

public int TP22method0(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9){
 switch(((var3*(int)(13))%(int)(46))){
case 0:
System.out.println("TP22 - TP22method0- LineInMethod: 2");
 break;
case 1:
var5 = (int)((var1*(int)(45))-(var0*var8));
 break;
case 2:
TPInterface4Method6(var7,var5,var7,var6,var4,var3,var4,var0,var3,var3,var8,var0); break;
case 3:
var6 = TP22method1(var6,var3,var8,var6,var2);
 break;
default :
var0 = (int)((((var5+var1)+(var3+var2))*((var2-var0)/(int)(2)))*(var6/(int)(30)));
}
return (int)var5;

}

public static int TP22method1(int var0, int var1, int var2, int var3, int var4){
 switch((var4-(int)(39))){
case 0:
System.out.println("TP22 - TP22method1- LineInMethod: 2");
 break;
case 1:
var1 = (int)(31);
 break;
case 2:
var1 = (int)(((var3%(int)(47))%(int)(41))/(int)(6));
 break;
case 3:
var3 = (int)(41);
 break;
case 4:
System.out.println("TP22 - TP22method1- LineInMethod: 15");
 break;
default :
System.out.println("TP22 - TP22method1- LineInMethod: 18");
}
return (int)var3;

}

public int TPInterface4Method8(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11){
 switch((var2%(int)(45))){
case 0:
var1 = (int)(((((((var2+var4)*(var3+var6))/(int)(34))/(int)(47))+(var11-var10))+(var3-var11))%(int)(36));
 break;
case 1:
System.out.println("TP22 - TPInterface4Method8- LineInMethod: 5");
 break;
case 2:
var0 = (int)((var2%(int)(43))-(var2+var9));
 break;
case 3:
var11 = (int)((var3-var6)-((var7*var3)-(var2+var5)));
 break;
default :
var11 = (int)((((var6*var7)*((var3+var2)*(var2+var3)))%(int)(25))/(int)(25));
}
return (int)var8;

}

public int TP22method3(int var0, int var1, int var2, int var3, int var4){
 if( (((var3-(int)(10))!=((var3-var1)+(var1%(int)(48))))||((((var0+var1)==(var0/(int)(37)))&&((var1*var2)>=(var3*var2)))&&((var2-(int)(45))<=(((var2+var0)*(((var0/(int)(44))+((var0*var2)-(var4+var1)))+(var2%(int)(31))))/(int)(44)))))){
var0 = (int)(var2*(int)(9));
}
if(((var2-var4)>(var1*(int)(22)))){
var4 = TPInterface4Method8(var0,var1,var4,var1,var0,var0,var2,var3,var2,var3,var3,var4);
}
else{
 var3 = (int)((var3/(int)(6))*(var0*var1));
}
if(((var3%(int)(47))>((var1+var3)+(var2/(int)(39))))){
var0 = (int)(var1%(int)(23));
}
else{
 var2 = (int)(44);
}
for(int i = 0; i < 5; i++){
 System.out.println("TP22 - TP22method3- LineInMethod: 16");
}
return (int)var1;

}

public int TPInterface4Method6(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11){
 switch((var7-(int)(33))){
case 0:
var1 = (int)(43);
 break;
case 1:
System.out.println("TP22 - TPInterface4Method6- LineInMethod: 4");
 break;
case 2:
System.out.println("TP22 - TPInterface4Method6- LineInMethod: 11");
 break;
case 3:
var0 = (int)(var6-var2);
 break;
case 4:
var9 = (int)(var10*var6);
 break;
default :
System.out.println("TP22 - TPInterface4Method6- LineInMethod: 20");
}
return (int)var10;

}


public static void main(String args[]){
TP22 obj = new TP22();
obj.TPInterface1Method0((int)(21),(int)(11),(int)(34),(int)(8),(int)(6),(int)(12),(int)(34),(int)(25),(int)(1),(int)(15),(int)(44),(int)(41),(int)(27));
obj.TP22method0((int)(30),(int)(1),(int)(15),(int)(34),(int)(23),(int)(18),(int)(44),(int)(31),(int)(39),(int)(38));
TP22method1((int)(49),(int)(38),(int)(14),(int)(37),(int)(11));
obj.TPInterface4Method8((int)(41),(int)(40),(int)(38),(int)(34),(int)(21),(int)(19),(int)(18),(int)(27),(int)(13),(int)(12),(int)(29),(int)(35));
obj.TP22method3((int)(42),(int)(30),(int)(47),(int)(21),(int)(7));
obj.TPInterface4Method6((int)(48),(int)(46),(int)(31),(int)(14),(int)(0),(int)(13),(int)(43),(int)(34),(int)(30),(int)(9),(int)(38),(int)(33));
}

public static void singleEntry(int i0,int i1,int i2,int i3,int i4,int i5,int i6,int i7,int i8,int i9,int i10,int i11,int i12,int i13,int i14){
TP22 obj = new TP22();
obj.TPInterface1Method0(i1,i7,i14,i13,i6,i9,i10,i3,i5,i0,i8,i11,i12);
obj.TP22method0(i10,i4,i6,i5,i13,i7,i8,i12,i11,i9);
TP22method1(i7,i9,i12,i1,i0);
obj.TPInterface4Method8(i2,i4,i3,i0,i14,i11,i13,i12,i1,i5,i9,i6);
obj.TP22method3(i4,i5,i8,i7,i1);
obj.TPInterface4Method6(i13,i2,i1,i3,i9,i12,i11,i14,i10,i6,i8,i0);
}

}