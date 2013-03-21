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

/*
 * CashPurseAccountBottomPanel.java
 *
 * Created on 18 Mar, 2011, 7:01:51 PM
 */
package com.moneychanger.ui.panels;

import com.moneychanger.core.CashPurseAccount;
import com.moneychanger.core.dataobjects.CashPurseDetails;
import com.moneychanger.core.util.Helpers;
import com.moneychanger.ui.MainPage;
import com.moneychanger.ui.dialogs.CashPurseDepositDialog;
import com.moneychanger.ui.dialogs.CashPurseExportDetails;
import com.moneychanger.ui.dialogs.CashPurseTokenDetails;
import com.moneychanger.ui.dialogs.ExportCashToDialog;
import com.moneychanger.ui.model.CashPurseTableModel;
import java.awt.Cursor;
import java.util.ArrayList;
import java.util.Map;
import javax.swing.JOptionPane;

/**
 *
 * @author Vicky C
 */
public class CashPurseAccountBottomPanel extends javax.swing.JPanel {

    private static CashPurseDetails details;

    /** Creates new form CashPurseAccountBottomPanel */
    public CashPurseAccountBottomPanel() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        jScrollPane_Account = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        filler5 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        jPanel_Actions = new javax.swing.JPanel();
        jButton_Exchange = new javax.swing.JButton();
        jButton_Export = new javax.swing.JButton();
        jButton_Deposit = new javax.swing.JButton();
        filler6 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        filler7 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));

        setName("Form"); // NOI18N
        setLayout(new java.awt.GridBagLayout());

        filler1.setName("filler1"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weighty = 2.0;
        add(filler1, gridBagConstraints);

        filler2.setName("filler2"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        add(filler2, gridBagConstraints);

        jScrollPane_Account.setName("jScrollPane_Account"); // NOI18N
        jScrollPane_Account.setPreferredSize(new java.awt.Dimension(200, 200));

        jTable5.setModel(new com.moneychanger.ui.model.CashPurseTableModel());
        jTable5.setName("jTable5"); // NOI18N
        jTable5.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable5MouseClicked(evt);
            }
        });
        jScrollPane_Account.setViewportView(jTable5);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 10.0;
        gridBagConstraints.weighty = 10.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(jScrollPane_Account, gridBagConstraints);

        filler3.setName("filler3"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        add(filler3, gridBagConstraints);

        filler4.setName("filler4"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weighty = 1.0;
        add(filler4, gridBagConstraints);

        filler5.setName("filler5"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        add(filler5, gridBagConstraints);

        jPanel_Actions.setName("jPanel_Actions"); // NOI18N
        jPanel_Actions.setLayout(new java.awt.GridBagLayout());

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance().getContext().getResourceMap(CashPurseAccountBottomPanel.class);
        jButton_Exchange.setText(resourceMap.getString("jButton_Exchange.text")); // NOI18N
        jButton_Exchange.setName("jButton_Exchange"); // NOI18N
        jButton_Exchange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ExchangeActionPerformed1(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel_Actions.add(jButton_Exchange, gridBagConstraints);

        jButton_Export.setText(resourceMap.getString("jButton_Export.text")); // NOI18N
        jButton_Export.setName("jButton_Export"); // NOI18N
        jButton_Export.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ExportActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel_Actions.add(jButton_Export, gridBagConstraints);

        jButton_Deposit.setText(resourceMap.getString("jButton_Deposit.text")); // NOI18N
        jButton_Deposit.setName("jButton_Deposit"); // NOI18N
        jButton_Deposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_DepositActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel_Actions.add(jButton_Deposit, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(jPanel_Actions, gridBagConstraints);

        filler6.setName("filler6"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        add(filler6, gridBagConstraints);

        filler7.setName("filler7"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weighty = 2.0;
        add(filler7, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void jTable5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable5MouseClicked
        System.out.println("Count:" + evt.getClickCount());
        if (evt.getClickCount() == 2) {
            String key = (String) jTable5.getModel().getValueAt(jTable5.getSelectedRow(), 6);
            System.out.println("In Cash Purse Grid double clcik, key:" + key);
            new CashPurseTokenDetails(null, true, key).setVisible(true);
        }
    }//GEN-LAST:event_jTable5MouseClicked

    private void jButton_DepositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DepositActionPerformed
    try {
            ArrayList selectedIndices = new ArrayList();
            for (int i = 0; i < jTable5.getRowCount(); i++) {
                String id = (String) jTable5.getModel().getValueAt(i, 3);
                if ((Boolean) jTable5.getModel().getValueAt(i, 5)) {
                    selectedIndices.add(id);
                }
            }
            System.out.println("selectedIndices:" + selectedIndices);
            if(selectedIndices.isEmpty()){
                int selected = JOptionPane.showConfirmDialog(this, "This will deposit all of the tokens in the purse", "Warning", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
                if(selected==2)
                    return;
            }
            new CashPurseDepositDialog(null, true, details, selectedIndices).setVisible(true);
        }catch(Exception e){
            e.printStackTrace();
        }
}//GEN-LAST:event_jButton_DepositActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton_ExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ExportActionPerformed
        try {
            
            ArrayList selectedIndices = new ArrayList();
            for (int i = 0; i < jTable5.getRowCount(); i++) {
                String id = (String) jTable5.getModel().getValueAt(i, 3);
                if ((Boolean) jTable5.getModel().getValueAt(i, 5)) {
                    selectedIndices.add(id);
                }
            }
            System.out.println("selectedIndices:" + selectedIndices);
            
            if(selectedIndices.isEmpty()){
                int selected = JOptionPane.showConfirmDialog(this, "This will export all of the tokens in the purse", "Warning", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
                if(selected==2)
                    return;
            }
            new ExportCashToDialog(null, true, details,selectedIndices).setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            setCursor(Cursor.getDefaultCursor());

        }
    }//GEN-LAST:event_jButton_ExportActionPerformed

    private void jButton_ExchangeActionPerformed1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ExchangeActionPerformed1

        try {
            if(true){
              JOptionPane.showMessageDialog(null, "Exchange is currently not supported","Error",JOptionPane.ERROR_MESSAGE);
              return;
            }

            CashPurseAccount cashPurseAccount = new CashPurseAccount();
            ArrayList selectedIndices = new ArrayList();
            for (int i = 0; i < jTable5.getRowCount(); i++) {
                String id = (String) jTable5.getModel().getValueAt(i, 3);
                if ((Boolean) jTable5.getModel().getValueAt(i, 5)) {
                    selectedIndices.add(id);
                }
            }
            System.out.println("selectedIndices:" + selectedIndices);

            if(selectedIndices.isEmpty()){
                int selected = JOptionPane.showConfirmDialog(this, "This will exchange all of the tokens in the purse", "Warning", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
                if(selected==2)
                    return;
            }

            setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
            boolean isSuccess = cashPurseAccount.exchangeCashPurse(details.getServerID(), details.getAssetID(), details.getNymID(), details.getPurse(), selectedIndices);
            if (isSuccess) {
                JOptionPane.showMessageDialog(this, "Cash exchanged successfully", "Exchange Success", JOptionPane.INFORMATION_MESSAGE);
                CashPurseDetails cashDetails = new CashPurseAccount().getCashPurseDetails(details.getServerID()+":"+details.getAssetID()+":"+details.getNymID());
                CashPurseAccountBottomPanel.populateCashPurseDetails(cashDetails);
                CashPurseAccountTopPanel.populateCashPurseDetails(cashDetails, cashDetails.getBalance());
                MainPage.reLoadAccount();
                //((CashPurseTableModel) jTable5.getModel()).setValue(cashPurseAccount.refreshGridData(details.getServerID(), details.getAssetID(), details.getNymID()), jTable5);
            } else {
                if(Helpers.getObj()!=null){
                  new CashPurseExportDetails(null, true,(String)Helpers.getObj(),false).setVisible(true);
                }else
                JOptionPane.showMessageDialog(this, "Error in cash purse exchange", "Server Error", JOptionPane.ERROR_MESSAGE);
    }
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            setCursor(Cursor.getDefaultCursor());

        }
    }//GEN-LAST:event_jButton_ExchangeActionPerformed1

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.Box.Filler filler4;
    private javax.swing.Box.Filler filler5;
    private javax.swing.Box.Filler filler6;
    private javax.swing.Box.Filler filler7;
    private javax.swing.JButton jButton_Deposit;
    private javax.swing.JButton jButton_Exchange;
    private javax.swing.JButton jButton_Export;
    private javax.swing.JPanel jPanel_Actions;
    private javax.swing.JScrollPane jScrollPane_Account;
    private static javax.swing.JTable jTable5;
    // End of variables declaration//GEN-END:variables

    public static void clearPanel() {
        if (jTable5 != null) {
            ((CashPurseTableModel) jTable5.getModel()).clearValue();
        }
    }

    public static void populateCashPurseDetails(CashPurseDetails cashDetails) {
        ((CashPurseTableModel) jTable5.getModel()).setValue(cashDetails.getPurseGrid(), jTable5);
        details = cashDetails;
    }
    public static void refreshGrid(Map data){
        ((CashPurseTableModel) jTable5.getModel()).setValue(data, jTable5);
    }
}
