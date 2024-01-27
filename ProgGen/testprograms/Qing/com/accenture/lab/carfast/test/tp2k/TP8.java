package com.accenture.lab.carfast.test.tp2k;


public class TP8 {


public int TP8method0(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9){
 if(((var6-(int)(43))==(var9*var5))){
var8 = (int)(((var0*var2)+(var7-(int)(12)))+((var6-var1)/(int)(28)));
}
else{
 System.out.println("TP8 - TP8method0- LineInMethod: 5");
}
switch((var1+var8)){
case 0:
var0 = (int)((var5+(int)(18))-(var6%(int)(13)));
 break;
case 1:
var7 = (int)((var6+var2)+(var7-var5));
 break;
case 2:
var7 = TP8method1(var3,var5,var7,var3);
 break;
case 3:
var0 = (int)((var0-var1)%(int)(21));
 break;
case 4:
var4 = TP8method1(var1,var4,var6,var8);
 break;
default :
System.out.println("TP8 - TP8method0- LineInMethod: 23");
}
return (int)var7;

}

public int TP8method1(int var0, int var1, int var2, int var3){
 if((((var3/(int)(43))*(var1-var2))==(var3-var2))){
var0 = (int)((var2*var1)+(var3/(int)(23)));
}
else{
 var1 = (int)((var3+var2)-(var3%(int)(14)));
}
if( (((var2+(int)(46))!=(var0-var1))||((var3+var0)<(var1+var2)))){
System.out.println("TP8 - TP8method1- LineInMethod: 8");
}
switch((var2*(int)(9))){
case 0:
System.out.println("TP8 - TP8method1- LineInMethod: 12");
 break;
case 1:
var1 = (int)(18);
 break;
case 2:
var0 = (int)(37);
 break;
case 3:
var2 = (int)((var2/(int)(28))*(var3%(int)(44)));
 break;
default :
var2 = (int)((var0-var1)+(var1*var3));
}
return (int)var0;

}

public int TP8method2(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10){
 if( (((var0*var2)%(int)(3))!=(var8+var0))){
System.out.println("TP8 - TP8method2- LineInMethod: 2");
}
if((((var9+var3)/(int)(44))==(var6%(int)(28)))){
var6 = (int)(var4-var6);
}
else{
 System.out.println("TP8 - TP8method2- LineInMethod: 12");
}
return (int)var2;

}

public int TP8method3(int var0, int var1, int var2, int var3){
 if( ((var2*var0)!=(var1-(int)(13)))){
var1 = (int)(13);
}
if( ((var2+var0)<=(var1%(int)(5)))){
if( (((var3-var1)<=(var1*(int)(41)))&&(((var1-var2)<=(var2+(int)(38)))&&(((var0-var3)<(var0*var3))||((var1*(int)(30))>(var2-var3)))))){
if( ((var3*(int)(10))>=(var3-var1))){
System.out.println("TP8 - TP8method3- LineInMethod: 8");
}
}
}
return (int)var0;

}


public static void main(String args[]){
TP8 obj = new TP8();
obj.TP8method0((int)(25),(int)(31),(int)(46),(int)(42),(int)(14),(int)(32),(int)(18),(int)(30),(int)(13),(int)(8));
obj.TP8method1((int)(32),(int)(19),(int)(30),(int)(40));
obj.TP8method2((int)(31),(int)(40),(int)(0),(int)(37),(int)(12),(int)(41),(int)(9),(int)(46),(int)(20),(int)(30),(int)(32));
obj.TP8method3((int)(11),(int)(31),(int)(45),(int)(18));
}

public static void singleEntry(int i0,int i1,int i2,int i3,int i4,int i5,int i6,int i7,int i8,int i9,int i10,int i11,int i12,int i13,int i14){
TP8 obj = new TP8();
obj.TP8method0(i12,i0,i6,i2,i5,i14,i4,i8,i13,i10);
obj.TP8method1(i14,i3,i5,i12);
obj.TP8method2(i13,i8,i1,i3,i12,i2,i9,i7,i5,i10,i0);
obj.TP8method3(i9,i2,i14,i7);
}

}