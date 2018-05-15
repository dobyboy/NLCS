/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortapplication.model;

import javax.swing.DefaultListModel;
import javax.swing.JList;

/**
 *
 * @author Truong Giang
 */
public class Code {

    private JList<String> listCode;

    public Code(JList<String> listCode) {
        this.listCode = listCode;
    }

    public void SelectionSort(JList list, int increase) {

        DefaultListModel<String> model1 = new DefaultListModel<>();

        model1.addElement("void SelectionSort(int a[], int n){");
        if (increase == 1) {
            model1.addElement(" int i, j, min;");
        } else {
            model1.addElement(" int i, j, max");
            model1.addElement(" for(i = 0; i < n-1; i++){");
        }
        if (increase == 1) {
            model1.addElement("     min = i;");
        } else {
            model1.addElement("     max = i;");
            model1.addElement("     for(j = i + 1; j < n; j++){");
        }
        if (increase == 1) {
            model1.addElement("         if(a[j] < a[min])   ");
            model1.addElement("             min = j;");
            model1.addElement("         if(min != i )");
            model1.addElement("             Swap(a[min], a[i]");
            model1.addElement("         }");
            model1.addElement("     }");
        } else {
            model1.addElement("         if(a[j] > a[max])   ");
            model1.addElement("             max = j;");
            model1.addElement("         if(max != i )");
            model1.addElement("             Swap(a[max], a[i]");
            model1.addElement("         }");
            model1.addElement("     }");
        }
        model1.addElement("  ");
        model1.addElement("void Swap(int a[], int b[]){");
        model1.addElement("  int temp;");
        model1.addElement("  temp = a;");
        model1.addElement("  a = b;");
        model1.addElement("  b = temp;");
        model1.addElement("}");

        listCode.setModel(model1);

    }

    public void InsertionSort(JList list, int increase) {

        DefaultListModel<String> model = new DefaultListModel<>(); // tạo danh sách các model

        model.addElement("void InsertionSort(int a[], int n){");
        model.addElement("  int i, j;");
        model.addElement("  for(i = 1; i < n; i++){");
        model.addElement("      j = i;");
        if (increase == 1) {
            model.addElement("      while((j > 0)&& (a[j] > a[j-1]){");
        } else {
            model.addElement("      while((j > 0)&& (a[j] < a[j-1]){");
        }
        model.addElement("          Swap(a[j], a[j-1])");
        model.addElement("          j--;");
        model.addElement("      }");
        model.addElement("  }");
        model.addElement("}");
        model.addElement("  ");
        model.addElement("void Swap(int a[], int b[]){");
        model.addElement("  int temp;");
        model.addElement("  temp = a;");
        model.addElement("  a = b;");
        model.addElement("  b = temp;");
        model.addElement("}");
        listCode.setModel(model); //set model vào list code
    }

    public void BubbleSort(JList list, int increase) {

        DefaultListModel<String> model2 = new DefaultListModel<>();

        model2.addElement("void BubbuleSort(int a[], int n){");
        model2.addElement(" int i, j;");
        model2.addElement(" for(i = 0; i < n - 1; i++){");
        model2.addElement("     for(j = n - 1; j > i){");
        if (increase == 1) {
            model2.addElement("         if(a[j] < a[j-1])");
        } else {
            model2.addElement("         if(a[j] > a[j-1])");
        }
        model2.addElement("             Swap(a[j], a[j-1]);");
        model2.addElement("     }");
        model2.addElement(" }");
        model2.addElement("}");
        model2.addElement("  ");
        model2.addElement("void Swap(int a[], int b[]){");
        model2.addElement("  int temp;");
        model2.addElement("  temp = a;");
        model2.addElement("  a = b;");
        model2.addElement("  b = temp;");
        model2.addElement("}");
        listCode.setModel(model2);
    }

    public void ShellSort(JList list, int increase) {

        DefaultListModel<String> model3 = new DefaultListModel<>(); // tạo danh sách các model

        model3.addElement("void ShellSort(int a[], int n){");
        model3.addElement("  int k = 1;");
        model3.addElement("  int p1, p2;");
        model3.addElement("  k = n/2 ;");
        model3.addElement("  while( k > 0){");
        model3.addElement("      for(p1 = 0; p1 < n; p1++){");
        model3.addElement("          int temp = a[p1];");
        model3.addElement("          p2 = p1;");
        if (increase == 1) {
            model3.addElement("      while((p2 >= k)&& (a[p2 - k] > temp){");
        } else {
            model3.addElement("      while((p2 >= k)&& (a[j] < a[j-1]){");
        }
        model3.addElement("          Swap(a[p2], a[p2-k])");
        model3.addElement("          p2 = p2 - k;");
        model3.addElement("          }");
        model3.addElement("      }");
        model3.addElement("  }");
        model3.addElement("}");
        model3.addElement("  ");
        model3.addElement("void Swap(int a[], int b[]){");
        model3.addElement("  int temp;");
        model3.addElement("  temp = a;");
        model3.addElement("  a = b;");
        model3.addElement("  b = temp;");
        model3.addElement("}");
        listCode.setModel(model3); //set model vào list code
    }

    public void QuickSort(JList list, int increase) {

        DefaultListModel<String> model4 = new DefaultListModel<>(); // tạo danh sách các model

        model4.addElement("int FindPivot(int a[], int i, int j){");
        model4.addElement("  int k, firstkey;");
        model4.addElement("  k = k + 1;");
        model4.addElement("  firstkey = a[i];");
        model4.addElement("  while( (k <= j)&&(a[k] == firstkey)) k++;");
        model4.addElement("  if(k > j) return -1;");
        model4.addElement("  if(a[k] > firstkey) return k;");
        model4.addElement("  return i;");
        model4.addElement("  }");
        model4.addElement("  ");
        model4.addElement("int Partition(int a[], int i, int j, int pivot){");
        model4.addElement("  int L ,R;");
        model4.addElement("  L = i;");
        model4.addElement("  R = j;");
        model4.addElement("  while( L <= R ){");
        if (increase == 1) {
            model4.addElement("      while( a[L] < pivot ) L++;");
            model4.addElement("      while( a[R] >= pivot ) R++;");
        } else {
            model4.addElement("      while( a[L] >= pivot ) L++;");
            model4.addElement("      while( a[R] < pivot ) R++;");
        }
        model4.addElement("      if(L < R) Swap(a[L], a[R])");
        model4.addElement("  }");
        model4.addElement("  return L;");
        model4.addElement("}");
        model4.addElement("  ");
        model4.addElement("void QuickSor(int a[], int i, int j){");
        model4.addElement("  int pivot, k, pivotindex;");
        model4.addElement("  if(pivotindex != -1){");
        model4.addElement("      pivot = a[pivotindex];");
        model4.addElement("      k = Partition(a, i, j, pivot)");
        model4.addElement("      QuickSort(a, i, k -1)");
        model4.addElement("      QuickSort(a, k, j)");
        model4.addElement("  ");
        model4.addElement("void Swap(int a[], int b[]){");
        model4.addElement("  int temp;");
        model4.addElement("  temp = a;");
        model4.addElement("  a = b;");
        model4.addElement("  b = temp;");
        model4.addElement("}");
        listCode.setModel(model4); //set model vào list code
    }

}
