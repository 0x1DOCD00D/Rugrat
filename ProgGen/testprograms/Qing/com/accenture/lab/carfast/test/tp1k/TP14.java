package com.accenture.lab.carfast.test.tp1k;


public class TP14 {


public static int TP14method0(int var0, int var1, int var2, int var3, int var4){
 if(((var3%(int)(61))!=(var3-(int)(19)))){
var1 = TP14method1(var3,var4,var4,var3,var0,var3,var4,var0,var4,var3,var0,var3,var3,var3);
}
else{
 System.out.println("TP14 - TP14method0- LineInMethod: 5");
}
for(int i = 0; i < 1; i++){
 System.out.println("TP14 - TP14method0- LineInMethod: 10");
}
return (int)var3;

}

public static int TP14method1(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13){
 if( (((var7/(int)(68))>((var0+var4)*(var8%(int)(19))))||((var7%(int)(51))>(var5/(int)(75))))){
if( ((var3*var4)==((var0-var9)-(var0+var1)))){
var7 = (int)(7);
}
}
if((((var12/(int)(75))*((var6*var13)*(var6%(int)(25))))<(var9-var13))){
System.out.println("TP14 - TP14method1- LineInMethod: 8");
}
else{
 System.out.println("TP14 - TP14method1- LineInMethod: 11");
}
return (int)var1;

}

public int TP14method2(int var0, int var1, int var2, int var3, int var4, int var5){
 for(int i = 0; i < 2; i++){
 if( ((var4/(int)(35))!=(var2%(int)(45)))){
System.out.println("TP14 - TP14method2- LineInMethod: 4");
}
}
switch((var3%(int)(49))){
case 0:
var2 = (int)((var0+var4)+(var1/(int)(19)));
 break;
case 1:
System.out.println("TP14 - TP14method2- LineInMethod: 11");
 break;
case 2:
var2 = (int)(22);
 break;
case 3:
System.out.println("TP14 - TP14method2- LineInMethod: 16");
 break;
case 4:
var3 = (int)(17);
 break;
case 5:
System.out.println("TP14 - TP14method2- LineInMethod: 22");
 break;
default :
System.out.println("TP14 - TP14method2- LineInMethod: 25");
}
return (int)var0;

}


public static void main(String args[]){
TP14 obj = new TP14();
TP14method0((int)(59),(int)(54),(int)(72),(int)(4),(int)(64));
TP14method1((int)(48),(int)(16),(int)(45),(int)(5),(int)(64),(int)(75),(int)(65),(int)(66),(int)(36),(int)(54),(int)(30),(int)(68),(int)(38),(int)(20));
obj.TP14method2((int)(49),(int)(35),(int)(43),(int)(63),(int)(23),(int)(24));
}

public static void singleEntry(int i0,int i1,int i2,int i3,int i4,int i5,int i6,int i7,int i8,int i9,int i10,int i11,int i12,int i13,int i14){
TP14 obj = new TP14();
TP14method0(i9,i7,i2,i0,i10);
TP14method1(i1,i12,i3,i4,i9,i0,i6,i10,i14,i5,i11,i2,i7,i13);
obj.TP14method2(i6,i12,i2,i3,i5,i10);
}

}