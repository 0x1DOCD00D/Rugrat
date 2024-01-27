package com.accenture.lab.carfast.test.tp1k;


public class TP2 {


public int TP2method0(int var0, int var1, int var2, int var3, int var4){
 if(((var1*var2)>(var4*var0))){
var0 = TP2method2(var2,var1,var4,var0,var3,var4);
}
else{
 TP2method2(var1,var1,var3,var3,var2,var2);}
for(int i = 0; i < 1; i++){
 var1 = (int)((((var4-(int)(41))+(var0+var3))%(int)(65))/(int)(23));
}
return (int)var0;

}

public static int TP2method1(int var0, int var1, int var2, int var3, int var4){
 switch((var1+(int)(54))){
case 0:
var0 = (int)((var2*(int)(49))-(var2/(int)(72)));
 break;
case 1:
System.out.println("TP2 - TP2method1- LineInMethod: 5");
 break;
case 2:
System.out.println("TP2 - TP2method1- LineInMethod: 8");
 break;
case 3:
var3 = (int)((var3/(int)(20))/(int)(26));
 break;
case 4:
System.out.println("TP2 - TP2method1- LineInMethod: 17");
 break;
default :
var4 = (int)(var3+var0);
}
return (int)var1;

}

public int TP2method2(int var0, int var1, int var2, int var3, int var4, int var5){
 for(int i = 0; i < 0; i++){
 System.out.println("TP2 - TP2method2- LineInMethod: 2");
}
for(int i = 0; i < 2; i++){
 if( (((var0/(int)(29))>(((var4+var0)+(var1-(int)(50)))+(var1+var4)))&&((var5+var2)>((var5+var4)/(int)(41))))){
var2 = (int)(49);
}
}
return (int)var1;

}


public static void main(String args[]){
TP2 obj = new TP2();
obj.TP2method0((int)(53),(int)(72),(int)(54),(int)(61),(int)(35));
TP2method1((int)(34),(int)(57),(int)(19),(int)(9),(int)(68));
obj.TP2method2((int)(66),(int)(52),(int)(21),(int)(10),(int)(46),(int)(56));
}

public static void singleEntry(int i0,int i1,int i2,int i3,int i4,int i5,int i6,int i7,int i8,int i9,int i10,int i11,int i12,int i13,int i14){
TP2 obj = new TP2();
obj.TP2method0(i9,i12,i2,i11,i0);
TP2method1(i7,i4,i12,i10,i5);
obj.TP2method2(i7,i13,i5,i1,i4,i6);
}

}