/*
Nama: Frankcy pamungkas
Nim: A11.2019.12305
Kelas: A11.4423
 */

package controller;

import Inputan.InputanSewaBuku; /*Memanggil file InputanSewaBuku.java dalam Package */
import Model.TabelSewaBuku; /*Memanggil file TabelSewaBuku*/
import Model.mTable; /* Memanggil file mTable*/
import gui.maingui; /*Memanggil maingui */
import java.util.List; /*Untuk memanggil package list pada java*/
import Interfaces.InterfacesSewaBuku; /*Memanggil file InterfacesSewaBuku*/

/**
 *
 * @author frankcy
 */
public class cSewaBuku {
      public cSewaBuku(maingui _tampil){
        this._tampilan = _tampil;
        InterfacesSewaBuku = new InputanSewaBuku();
    }
    
        public void IsiTable(){
      list_sewaBuku = InterfacesSewaBuku.GetAll();
      TabelSewaBuku tabelSewaBuku = new TabelSewaBuku(list_sewaBuku);
      _tampilan.GetTabelData().setModel(tabelSewaBuku);
        
    }
       
       maingui _tampilan;
       InterfacesSewaBuku InterfacesSewaBuku;
       List<mTable> list_sewaBuku;
    
}
