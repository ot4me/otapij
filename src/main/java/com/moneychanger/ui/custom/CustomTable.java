/************************************************************
-----BEGIN PGP SIGNED MESSAGE-----
Hash: SHA1

 *                 M O N E Y C H A N G E R
 *
 *  Open Transactions:
 *       Financial Cryptography and Digital Cash
 *       Library, Protocol, API, Server, CLI, GUI 
 *    
 *       -- Anonymous Numbered Accounts.
 *       -- Untraceable Digital Cash.
 *       -- Triple-Signed Receipts.
 *       -- Cheques, Vouchers, Transfers, Inboxes.
 *       -- Basket Currencies, Markets, Payment Plans.
 *       -- Signed, XML, Ricardian-style Contracts.
 *       -- Scripted smart contracts.
 *    
 *  Copyright (C) 2010-2013 by "Fellow Traveler" (A pseudonym)
 *
 *  EMAIL:
 *  FellowTraveler@rayservers.net --- SEE PGP KEY BELOW.
 *  F3llowTraveler@gmail.com --- (not preferred.)
 *  
 *  FINGERPRINT:
 *  9DD5 90EB 9292 4B48 0484  7910 0308 00ED F951 BB8E
 *
 *  BITCOIN:  1NtTPVVjDsUfDWybS4BwvHpG2pdS9RnYyQ
 *
 *  OFFICIAL PROJECT WIKI:
 *  https://github.com/FellowTraveler/Moneychanger
 *  https://github.com/FellowTraveler/Open-Transactions/wiki
 *
 *  WEBSITE:
 *  http://www.OpenTransactions.org/
 *    
 *  Components and licensing:
 *   -- Moneychanger..A Java client GUI.....LICENSE:.....GPLv3
 *   -- otlib.........A class library.......LICENSE:...LAGPLv3
 *   -- otapi.........A client API..........LICENSE:...LAGPLv3
 *   -- opentxs/ot....Command-line client...LICENSE:...LAGPLv3
 *   -- otserver......Server Application....LICENSE:....AGPLv3
 *  Github.com/FellowTraveler/Open-Transactions/wiki/Components
 *
 *  All of the above OT components were designed and written by
 *  Fellow Traveler, with the exception of Moneychanger, which
 *  was contracted out to Vicky C (bitcointrader4@gmail.com).
 *  The open-source community has since actively contributed.
 *
 *  -----------------------------------------------------
 *
 *   LICENSE:
 *   This program is free software: you can redistribute it
 *   and/or modify it under the terms of the GNU General
 *   Public License as published by the Free Software
 *   Foundation, either version 3 of the License, or (at your
 *   option) any later version.
 *
 *   You should have received a copy of the GNU General
 *   Public License along with this program.  If not, see:
 *   http://www.gnu.org/licenses/
 *
 *   If you would like to use this software outside of the free
 *   software license, please contact FellowTraveler.
 *   (Unfortunately many will run anonymously and untraceably,
 *   so who could really stop them?)
 *   
 *   DISCLAIMER:
 *   This program is distributed in the hope that it will be
 *   useful, but WITHOUT ANY WARRANTY; without even the implied
 *   warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR
 *   PURPOSE.  See the GNU General Public License for more
 *   details.

-----BEGIN PGP SIGNATURE-----
Version: GnuPG v1.4.9 (Darwin)

iQIcBAEBAgAGBQJRSsfMAAoJEAMIAO35UbuOCTQQAJWUR6l+IbUGYPfudumDBZep
XWu5aUVXPt+HTetWobTT3VrSEoQTV+t3Qk10EHzIIQNIvDNkA3cfQod5xMk3CZgm
MuA1PTDZdmrcm1lf92rVULaiB2tHYuPKYryFfkmNcidoWaJAI0ny/AE4gSdopKuU
MCLhB+fWpPv+nK9Qjb8duvRyFjYeLxrnwjfy05zNIY5Fj4HsCzmf6G6xqbUOZzBA
Zc4RjfKeg9MVJl4ObIKhDfpicCTVZkgFPVGeok/KtmiPRgV1HtaHqib4RiN9VMkr
YKbOUOb931pukRJQv+z5fT1EQkSVBDO5Th2q7Nls5idMgtR2BPXxVhs+e8OM4IJK
W+1V0WHWHuE+6SRKQrPU4hAmXrtmGRtu474TTmPlW6dCqFgvLWBuxeTRCPf4l29T
ImEOxdjFwlMVoxsazE3KE/YMbX7IiZqgLx/C4OTPlz7BVLhphzPRXA7KhhRFi1Df
jie5oRhJ4zbTFQI8SKsjbx0H/4VpB+Vtjx6fOxnLUpjZAE7G6ZL2zOEK8rtiGeiH
0AWK2rKWP8oOMnQwBMP838WRtxFmaOIhvVqAngjynSmVouf1RKKU7y7/YQ0iVDcN
WqAhaZhvszQ6UCDAEi11rfdC2qt29Jds9lS41YGqvYaan+b50lr5u59Uknz2LC94
HS4/gWtdVEVnXDda0wk9
=CbRB
-----END PGP SIGNATURE-----
 **************************************************************/



/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.moneychanger.ui.custom;

import com.moneychanger.core.util.Helpers;
import com.moneychanger.ui.model.AccountTableModel;
import com.moneychanger.ui.model.AssetContractTableModel;
import com.moneychanger.ui.model.BasketTableModel;
import com.moneychanger.ui.model.NYMBoxTableModel;
import com.moneychanger.ui.model.NYMOutboxTableModel;
import com.moneychanger.ui.model.NYMTableModel;
import com.moneychanger.ui.model.OTInboxTableModel;
import com.moneychanger.ui.model.OTOutboxTableModel;
import com.moneychanger.ui.model.ServerContractTableModel;
import java.awt.Component;
import javax.swing.JComponent;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author Vicky C
 */
public class CustomTable extends JTable {

    public Component prepareRenderer(TableCellRenderer renderer,
            int rowIndex, int vColIndex) {
        Component c = super.prepareRenderer(renderer, rowIndex, vColIndex);
        if (c instanceof JComponent) {
            JComponent jc = (JComponent) c;
            if(getValueAt(rowIndex, vColIndex) instanceof String){
                //Utility.getKeyFromName((String)getValueAt(rowIndex, vColIndex));
                String value = (String)getValueAt(rowIndex, vColIndex);
                if(this.getModel() instanceof AccountTableModel && vColIndex==0){
                    value = (String)this.getModel().getValueAt(rowIndex, 3);
                }
                if(this.getModel() instanceof NYMTableModel && vColIndex==0){
                    value = (String)this.getModel().getValueAt(rowIndex, 1);
                }
                if(this.getModel() instanceof BasketTableModel && vColIndex==0){
                    value = (String)this.getModel().getValueAt(rowIndex, 1);
                }
                if(this.getModel() instanceof AssetContractTableModel && vColIndex==0){
                    value = (String)this.getModel().getValueAt(rowIndex, 1);
                }
                if(this.getModel() instanceof ServerContractTableModel && vColIndex==0){
                    value = (String)this.getModel().getValueAt(rowIndex, 1);
                }


                if(this.getModel() instanceof OTOutboxTableModel){
                    if(vColIndex==4)
                    value = (String)this.getModel().getValueAt(rowIndex, 8);
                    if(vColIndex==5)
                    value = (String)this.getModel().getValueAt(rowIndex, 9);

                }
                if(this.getModel() instanceof OTInboxTableModel){
                    if(vColIndex==4)
                    value = (String)this.getModel().getValueAt(rowIndex, 10);
                    if(vColIndex==5)
                    value = (String)this.getModel().getValueAt(rowIndex, 11);

                }
                if(this.getModel() instanceof NYMOutboxTableModel){
                     if(vColIndex==1)
                    value = (String)this.getModel().getValueAt(rowIndex, 4);
                    if(vColIndex==2)
                    value = (String)this.getModel().getValueAt(rowIndex, 5);
                }
                if(this.getModel() instanceof NYMBoxTableModel){
                   if(vColIndex==1)
                    value = (String)this.getModel().getValueAt(rowIndex, 4);
                    if(vColIndex==2)
                    value = (String)this.getModel().getValueAt(rowIndex, 5);

                }
                jc.setToolTipText(value);
            }

        }
        return c;
    }
}
