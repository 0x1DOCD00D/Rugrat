package com.accenture.lab.carfast.test.tp2k;


public class TP17 extends TP14 {


public static int TP17method0(int var0, int var1, int var2, int var3){
 if((((var0+(int)(42))<=(((var3-var1)-(var1*var3))*(var0*var3)))||((var2+(int)(39))<(var1%(int)(14))))){
TP17method2(var0,var0,var0,var1,var2);}
else{
 System.out.println("TP17 - TP17method0- LineInMethod: 5");
}
if((((var0+var2)-((var3*var1)-(var1*var3)))<(var0*var1))){
System.out.println("TP17 - TP17method0- LineInMethod: 13");
}
else{
 System.out.println("TP17 - TP17method0- LineInMethod: 16");
}
return (int)var1;

}

public int TP14method0(int var0, int var1, int var2, int var3){
 switch((var2-(int)(25))){
case 0:
TP14method2(var3,var0,var1,var2,var2,var3,var0,var3,var1); break;
case 1:
System.out.println("TP17 - TP14method0- LineInMethod: 5");
 break;
case 2:
var3 = (int)(0);
 break;
case 3:
var0 = (int)(var1-var0);
 break;
default :
System.out.println("TP17 - TP14method0- LineInMethod: 13");
}
return (int)var2;

}

public static int TP17method2(int var0, int var1, int var2, int var3, int var4){
 switch((var0/(int)(20))){
case 0:
var0 = (int)(12);
 break;
case 1:
var0 = (int)((var3+var0)*(var2%(int)(5)));
 break;
case 2:
var1 = (int)((var0-var1)+(var0-var3));
 break;
case 3:
System.out.println("TP17 - TP17method2- LineInMethod: 10");
 break;
default :
System.out.println("TP17 - TP17method2- LineInMethod: 16");
}
return (int)var3;

}

public int TP14method2(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8){
 switch((var6*var5)){
case 0:
var5 = (int)(var7+var2);
 break;
case 1:
var7 = (int)((var0+var2)+(var0*var8));
 break;
case 2:
var4 = (int)((var0-var8)+(var8-var1));
 break;
case 3:
System.out.println("TP17 - TP14method2- LineInMethod: 11");
 break;
case 4:
var6 = (int)((var2-var0)*(var4%(int)(9)));
 break;
default :
System.out.println("TP17 - TP14method2- LineInMethod: 20");
}
return (int)var1;

}


public static void main(String args[]){
TP17 obj = new TP17();
TP17method0((int)(42),(int)(16),(int)(26),(int)(11));
obj.TP14method0((int)(9),(int)(18),(int)(49),(int)(13));
TP17method2((int)(21),(int)(40),(int)(2),(int)(4),(int)(32));
obj.TP14method2((int)(16),(int)(24),(int)(33),(int)(46),(int)(27),(int)(10),(int)(17),(int)(27),(int)(10));
}

public static void singleEntry(int i0,int i1,int i2,int i3,int i4,int i5,int i6,int i7,int i8,int i9,int i10,int i11,int i12,int i13,int i14){
TP17 obj = new TP17();
TP17method0(i10,i2,i0,i13);
obj.TP14method0(i1,i8,i9,i12);
TP17method2(i14,i2,i10,i4,i7);
obj.TP14method2(i9,i0,i4,i2,i11,i7,i3,i10,i1);
}

}