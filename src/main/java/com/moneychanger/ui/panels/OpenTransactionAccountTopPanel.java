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
 * OpenTransactionAccountTopPanel.java
 *
 * Created on 18 Mar, 2011, 7:40:38 AM
 */
package com.moneychanger.ui.panels;

import com.moneychanger.core.OpenTransactionAccount;
import com.moneychanger.core.dataobjects.OTDetails;
import com.moneychanger.ui.dialogs.DepositCashDialog;
import com.moneychanger.ui.dialogs.DepositChequeDialog;
import com.moneychanger.ui.dialogs.ExchangeBasketDialog;
import com.moneychanger.ui.dialogs.OTWriteCheque;
import com.moneychanger.ui.dialogs.SendTransferDialog;
import com.moneychanger.ui.dialogs.WithdrawCashDialog;
import com.moneychanger.ui.dialogs.WithdrawVoucherDialog;
import com.moneychanger.core.util.Helpers;
import java.awt.Cursor;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.opentransactions.otjavalib.util.Utility;

/**
 *
 * @author Vicky C
 */
public class OpenTransactionAccountTopPanel extends javax.swing.JPanel {

    /** Creates new form OpenTransactionAccountTopPanel */
    public OpenTransactionAccountTopPanel() {
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
        jLabel_AssetTypeName = new javax.swing.JLabel();
        jTextField_AssetName = new javax.swing.JTextField();
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        jLabel_CurrentBalance = new javax.swing.JLabel();
        jTextField_Balance = new javax.swing.JTextField();
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        filler10 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        jPanel_UpdateChecActions = new javax.swing.JPanel();
        filler7 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        jButton_DownloadAccountFiles = new javax.swing.JButton();
        filler25 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        jButton_VerifyFiles = new javax.swing.JButton();
        filler24 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        filler8 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        jLabel_AssetID = new javax.swing.JLabel();
        jTextField_AssetID = new javax.swing.JTextField();
        filler9 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        filler11 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        jLabel_NymName = new javax.swing.JLabel();
        jTextField_NymName = new javax.swing.JTextField();
        filler12 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        jLabel_NymID = new javax.swing.JLabel();
        jTextField_NymID = new javax.swing.JTextField();
        filler13 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        filler15 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        jLabel_AccountName = new javax.swing.JLabel();
        jTextField_AccountName = new javax.swing.JTextField();
        filler14 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        jLabel_AccountID = new javax.swing.JLabel();
        jTextField_AccountID = new javax.swing.JTextField();
        filler16 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        filler17 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        jLabel_ServerName = new javax.swing.JLabel();
        jTextField_ServerName = new javax.swing.JTextField();
        filler18 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        jLabel_ServerID = new javax.swing.JLabel();
        jTextField_ServerID = new javax.swing.JTextField();
        filler19 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        filler20 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        filler21 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        jPanel_AccountActions = new javax.swing.JPanel();
        jButton_WriteCheque = new javax.swing.JButton();
        jButton_DepositCheque = new javax.swing.JButton();
        jButton_WithdrawCash = new javax.swing.JButton();
        jButton_DepositCash = new javax.swing.JButton();
        jButton_SendTransfer = new javax.swing.JButton();
        jButton_PurchaseVoucher = new javax.swing.JButton();
        jPanel_AccountBasket = new javax.swing.JPanel();
        filler5 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        jLabel_BasketName = new javax.swing.JLabel();
        jButton_In = new javax.swing.JButton();
        jButton_Out = new javax.swing.JButton();
        filler6 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        jLabel_basket = new javax.swing.JLabel();
        filler22 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        filler23 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));

        setName("Form"); // NOI18N
        setPreferredSize(new java.awt.Dimension(800, 390));
        setLayout(new java.awt.GridBagLayout());

        filler1.setName("filler1"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weighty = 3.0;
        add(filler1, gridBagConstraints);

        filler2.setName("filler2"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 5.0;
        add(filler2, gridBagConstraints);

        jLabel_AssetTypeName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance().getContext().getResourceMap(OpenTransactionAccountTopPanel.class);
        jLabel_AssetTypeName.setText(resourceMap.getString("jLabel_AssetTypeName.text")); // NOI18N
        jLabel_AssetTypeName.setName("jLabel_AssetTypeName"); // NOI18N
        jLabel_AssetTypeName.setPreferredSize(null);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(jLabel_AssetTypeName, gridBagConstraints);

        jTextField_AssetName.setBackground(resourceMap.getColor("jTextField_AssetName.background")); // NOI18N
        jTextField_AssetName.setEditable(false);
        jTextField_AssetName.setName("jTextField_AssetName"); // NOI18N
        jTextField_AssetName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_AssetNameActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 50.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(jTextField_AssetName, gridBagConstraints);

        filler3.setName("filler3"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        add(filler3, gridBagConstraints);

        jLabel_CurrentBalance.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel_CurrentBalance.setText(resourceMap.getString("jLabel_CurrentBalance.text")); // NOI18N
        jLabel_CurrentBalance.setName("jLabel_CurrentBalance"); // NOI18N
        jLabel_CurrentBalance.setPreferredSize(null);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(jLabel_CurrentBalance, gridBagConstraints);

        jTextField_Balance.setEditable(false);
        jTextField_Balance.setName("jTextField_Balance"); // NOI18N
        jTextField_Balance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_BalanceActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 50.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(jTextField_Balance, gridBagConstraints);

        filler4.setName("filler4"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 5.0;
        add(filler4, gridBagConstraints);

        filler10.setName("filler10"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 5.0;
        add(filler10, gridBagConstraints);

        jPanel_UpdateChecActions.setMinimumSize(new java.awt.Dimension(10, 25));
        jPanel_UpdateChecActions.setName("jPanel_UpdateChecActions"); // NOI18N
        jPanel_UpdateChecActions.setPreferredSize(new java.awt.Dimension(10, 25));
        jPanel_UpdateChecActions.setLayout(new java.awt.GridBagLayout());

        filler7.setName("filler7"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        jPanel_UpdateChecActions.add(filler7, gridBagConstraints);

        jButton_DownloadAccountFiles.setText(resourceMap.getString("jButton_DownloadAccountFiles.text")); // NOI18N
        jButton_DownloadAccountFiles.setMinimumSize(new java.awt.Dimension(85, 23));
        jButton_DownloadAccountFiles.setName(""); // NOI18N
        jButton_DownloadAccountFiles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_DownloadAccountFilesActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel_UpdateChecActions.add(jButton_DownloadAccountFiles, gridBagConstraints);

        filler25.setName("filler25"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        jPanel_UpdateChecActions.add(filler25, gridBagConstraints);

        jButton_VerifyFiles.setText(resourceMap.getString("jButton_VerifyFiles.text")); // NOI18N
        jButton_VerifyFiles.setName(""); // NOI18N
        jButton_VerifyFiles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_VerifyFilesActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel_UpdateChecActions.add(jButton_VerifyFiles, gridBagConstraints);

        filler24.setName("filler24"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        jPanel_UpdateChecActions.add(filler24, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 50.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(jPanel_UpdateChecActions, gridBagConstraints);

        filler8.setName("filler8"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        add(filler8, gridBagConstraints);

        jLabel_AssetID.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel_AssetID.setText(resourceMap.getString("jLabel_AssetID.text")); // NOI18N
        jLabel_AssetID.setName("jLabel_AssetID"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(jLabel_AssetID, gridBagConstraints);

        jTextField_AssetID.setEditable(false);
        jTextField_AssetID.setName("jTextField_AssetID"); // NOI18N
        jTextField_AssetID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_AssetIDActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTH;
        gridBagConstraints.weightx = 50.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(jTextField_AssetID, gridBagConstraints);

        filler9.setName("filler9"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 5.0;
        add(filler9, gridBagConstraints);

        filler11.setName("filler11"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 5.0;
        add(filler11, gridBagConstraints);

        jLabel_NymName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel_NymName.setText(resourceMap.getString("jLabel_NymName.text")); // NOI18N
        jLabel_NymName.setName("jLabel_NymName"); // NOI18N
        jLabel_NymName.setPreferredSize(null);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(jLabel_NymName, gridBagConstraints);

        jTextField_NymName.setText(resourceMap.getString("jTextField_NymName.text")); // NOI18N
        jTextField_NymName.setName("jTextField_NymName"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 50.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(jTextField_NymName, gridBagConstraints);

        filler12.setName("filler12"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        add(filler12, gridBagConstraints);

        jLabel_NymID.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel_NymID.setText(resourceMap.getString("jLabel_NymID.text")); // NOI18N
        jLabel_NymID.setName("jLabel_NymID"); // NOI18N
        jLabel_NymID.setPreferredSize(null);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(jLabel_NymID, gridBagConstraints);

        jTextField_NymID.setEditable(false);
        jTextField_NymID.setName("jTextField_NymID"); // NOI18N
        jTextField_NymID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_NymIDActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 50.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(jTextField_NymID, gridBagConstraints);

        filler13.setName("filler13"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 5.0;
        add(filler13, gridBagConstraints);

        filler15.setName("filler15"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 5.0;
        add(filler15, gridBagConstraints);

        jLabel_AccountName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel_AccountName.setText(resourceMap.getString("jLabel_AccountName.text")); // NOI18N
        jLabel_AccountName.setName("jLabel_AccountName"); // NOI18N
        jLabel_AccountName.setPreferredSize(null);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(jLabel_AccountName, gridBagConstraints);

        jTextField_AccountName.setBackground(resourceMap.getColor("jTextField_AccountName.background")); // NOI18N
        jTextField_AccountName.setEditable(false);
        jTextField_AccountName.setName("jTextField_AccountName"); // NOI18N
        jTextField_AccountName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_AccountNameActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 50.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(jTextField_AccountName, gridBagConstraints);

        filler14.setName("filler14"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        add(filler14, gridBagConstraints);

        jLabel_AccountID.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel_AccountID.setText(resourceMap.getString("jLabel_AccountID.text")); // NOI18N
        jLabel_AccountID.setName("jLabel_AccountID"); // NOI18N
        jLabel_AccountID.setPreferredSize(null);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(jLabel_AccountID, gridBagConstraints);

        jTextField_AccountID.setEditable(false);
        jTextField_AccountID.setName("jTextField_AccountID"); // NOI18N
        jTextField_AccountID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_AccountIDActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 50.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(jTextField_AccountID, gridBagConstraints);

        filler16.setName("filler16"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 5.0;
        add(filler16, gridBagConstraints);

        filler17.setName("filler17"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 5.0;
        add(filler17, gridBagConstraints);

        jLabel_ServerName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel_ServerName.setText(resourceMap.getString("jLabel_ServerName.text")); // NOI18N
        jLabel_ServerName.setName("jLabel_ServerName"); // NOI18N
        jLabel_ServerName.setPreferredSize(null);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(jLabel_ServerName, gridBagConstraints);

        jTextField_ServerName.setBackground(resourceMap.getColor("jTextField_ServerName.background")); // NOI18N
        jTextField_ServerName.setEditable(false);
        jTextField_ServerName.setName("jTextField_ServerName"); // NOI18N
        jTextField_ServerName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_ServerNameActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 50.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(jTextField_ServerName, gridBagConstraints);

        filler18.setName("filler18"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        add(filler18, gridBagConstraints);

        jLabel_ServerID.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel_ServerID.setText(resourceMap.getString("jLabel_ServerID.text")); // NOI18N
        jLabel_ServerID.setName("jLabel_ServerID"); // NOI18N
        jLabel_ServerID.setPreferredSize(null);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(jLabel_ServerID, gridBagConstraints);

        jTextField_ServerID.setEditable(false);
        jTextField_ServerID.setName("jTextField_ServerID"); // NOI18N
        jTextField_ServerID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_ServerIDActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 50.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(jTextField_ServerID, gridBagConstraints);

        filler19.setName("filler19"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 5.0;
        add(filler19, gridBagConstraints);

        filler20.setName("filler20"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weighty = 1.0;
        add(filler20, gridBagConstraints);

        filler21.setName("filler21"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 5.0;
        add(filler21, gridBagConstraints);

        jPanel_AccountActions.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel_AccountActions.setName("jPanel_AccountActions"); // NOI18N
        jPanel_AccountActions.setLayout(new java.awt.GridBagLayout());

        jButton_WriteCheque.setText(resourceMap.getString("jButton_WriteCheque.text")); // NOI18N
        jButton_WriteCheque.setName("jButton_WriteCheque"); // NOI18N
        jButton_WriteCheque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_WriteChequeActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 5, 10);
        jPanel_AccountActions.add(jButton_WriteCheque, gridBagConstraints);

        jButton_DepositCheque.setText(resourceMap.getString("jButton_DepositCheque.text")); // NOI18N
        jButton_DepositCheque.setName("jButton_DepositCheque"); // NOI18N
        jButton_DepositCheque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_DepositChequeActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 5, 10);
        jPanel_AccountActions.add(jButton_DepositCheque, gridBagConstraints);

        jButton_WithdrawCash.setText(resourceMap.getString("jButton_WithdrawCash.text")); // NOI18N
        jButton_WithdrawCash.setName("jButton_WithdrawCash"); // NOI18N
        jButton_WithdrawCash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_WithdrawCashActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 5, 10);
        jPanel_AccountActions.add(jButton_WithdrawCash, gridBagConstraints);

        jButton_DepositCash.setText(resourceMap.getString("jButton_DepositCash.text")); // NOI18N
        jButton_DepositCash.setName("jButton_DepositCash"); // NOI18N
        jButton_DepositCash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_DepositCashActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 5, 10);
        jPanel_AccountActions.add(jButton_DepositCash, gridBagConstraints);

        jButton_SendTransfer.setText(resourceMap.getString("jButton_SendTransfer.text")); // NOI18N
        jButton_SendTransfer.setName("jButton_SendTransfer"); // NOI18N
        jButton_SendTransfer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SendTransferActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 5, 10);
        jPanel_AccountActions.add(jButton_SendTransfer, gridBagConstraints);

        jButton_PurchaseVoucher.setText(resourceMap.getString("jButton_PurchaseVoucher.text")); // NOI18N
        jButton_PurchaseVoucher.setName("jButton_PurchaseVoucher"); // NOI18N
        jButton_PurchaseVoucher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_PurchaseVoucherActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 5, 10);
        jPanel_AccountActions.add(jButton_PurchaseVoucher, gridBagConstraints);

        jPanel_AccountBasket.setBorder(javax.swing.BorderFactory.createTitledBorder(resourceMap.getString("jPanel_AccountBasket.border.title"))); // NOI18N
        jPanel_AccountBasket.setName("jPanel_AccountBasket"); // NOI18N
        jPanel_AccountBasket.setPreferredSize(new java.awt.Dimension(150, 80));
        jPanel_AccountBasket.setVisible(false);
        jPanel_AccountBasket.setLayout(new java.awt.GridBagLayout());

        filler5.setName("filler5"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.weightx = 1.0;
        jPanel_AccountBasket.add(filler5, gridBagConstraints);

        jLabel_BasketName.setText(resourceMap.getString("jLabel_BasketName.text")); // NOI18N
        jLabel_BasketName.setName("jLabel_BasketName"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel_AccountBasket.add(jLabel_BasketName, gridBagConstraints);

        jButton_In.setText(resourceMap.getString("jButton_In.text")); // NOI18N
        jButton_In.setName("jButton_In"); // NOI18N
        jButton_In.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_InActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel_AccountBasket.add(jButton_In, gridBagConstraints);

        jButton_Out.setText(resourceMap.getString("jButton_Out.text")); // NOI18N
        jButton_Out.setName("jButton_Out"); // NOI18N
        jButton_Out.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_OutActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel_AccountBasket.add(jButton_Out, gridBagConstraints);

        filler6.setName("filler6"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.weightx = 1.0;
        jPanel_AccountBasket.add(filler6, gridBagConstraints);

        jLabel_basket.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel_basket.setText(resourceMap.getString("jLabel_basket.text")); // NOI18N
        jLabel_basket.setMaximumSize(new java.awt.Dimension(200, 20));
        jLabel_basket.setName("jLabel_basket"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel_AccountBasket.add(jLabel_basket, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel_AccountActions.add(jPanel_AccountBasket, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.RELATIVE;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(jPanel_AccountActions, gridBagConstraints);

        filler22.setName("filler22"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 5.0;
        add(filler22, gridBagConstraints);

        filler23.setName("filler23"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weighty = 3.0;
        add(filler23, gridBagConstraints);

        getAccessibleContext().setAccessibleParent(this);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_BalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_BalanceActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_jTextField_BalanceActionPerformed

    private void jTextField_AccountNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_AccountNameActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_jTextField_AccountNameActionPerformed

    private void jTextField_ServerNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_ServerNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_ServerNameActionPerformed

    private void jTextField_AssetNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_AssetNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_AssetNameActionPerformed

    private void jTextField_AccountIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_AccountIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_AccountIDActionPerformed

    private void jTextField_AssetIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_AssetIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_AssetIDActionPerformed

    private void jTextField_ServerIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_ServerIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_ServerIDActionPerformed

    private void jTextField_NymIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_NymIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_NymIDActionPerformed

    private void jButton_DepositChequeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DepositChequeActionPerformed
        new DepositChequeDialog(null, true, jTextField_ServerID.getText(), jTextField_NymID.getText(), jTextField_AccountID.getText()).setVisible(true);
    }//GEN-LAST:event_jButton_DepositChequeActionPerformed

    private void jButton_WithdrawCashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_WithdrawCashActionPerformed
        new WithdrawCashDialog(null, true, jTextField_ServerID.getText(), jTextField_NymID.getText(), jTextField_AccountID.getText()).setVisible(true);
    }//GEN-LAST:event_jButton_WithdrawCashActionPerformed

    private void jButton_DepositCashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DepositCashActionPerformed
        String[] purseDetails = new OpenTransactionAccount().getPurseBalance(jTextField_ServerID.getText(), jTextField_AssetID.getText(), jTextField_NymID.getText());
        /*if(purseDetails==null){
        JOptionPane.showMessageDialog(this, "Error in cash deposit. Empty purse","Error",JOptionPane.ERROR_MESSAGE);
        return;
        }*/
        new DepositCashDialog(null, true, purseDetails, jTextField_ServerID.getText(), jTextField_NymID.getText(), jTextField_AccountID.getText()).setVisible(true);
    }//GEN-LAST:event_jButton_DepositCashActionPerformed

    private void jButton_PurchaseVoucherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_PurchaseVoucherActionPerformed
        new WithdrawVoucherDialog(null, true, jTextField_ServerID.getText(), jTextField_NymID.getText(), jTextField_AccountID.getText()).setVisible(true);
    }//GEN-LAST:event_jButton_PurchaseVoucherActionPerformed

    private void jButton_WriteChequeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_WriteChequeActionPerformed
        new OTWriteCheque(null, true, jTextField_ServerID.getText(), jTextField_NymID.getText(), jTextField_AccountID.getText(),"").setVisible(true);
    }//GEN-LAST:event_jButton_WriteChequeActionPerformed

    private void jButton_SendTransferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SendTransferActionPerformed
        new SendTransferDialog(null, true, jTextField_ServerID.getText(), jTextField_NymID.getText(), jTextField_AccountID.getText()).setVisible(true);
    }//GEN-LAST:event_jButton_SendTransferActionPerformed

    private void jButton_DownloadAccountFilesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DownloadAccountFilesActionPerformed
        String accountID = jTextField_AccountID.getText();
        try {
            OpenTransactionAccount openTransaction = new OpenTransactionAccount();
            setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
            boolean isSuccess = Helpers.getInboxOutboxAccount(accountID, true); // download the data.
            if (isSuccess) {
                JOptionPane.showMessageDialog(this, "Files downloaded successfully", "Processing Success", JOptionPane.INFORMATION_MESSAGE);
                OpenTransactionAccountBottomPanel.setOTTables(openTransaction.getInboxData(accountID), openTransaction.getOutboxData(accountID));
            } else {
                JOptionPane.showMessageDialog(this, "Error in downloading latest account files", "Server Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            setCursor(Cursor.getDefaultCursor());
        }
}//GEN-LAST:event_jButton_DownloadAccountFilesActionPerformed

    private void jButton_VerifyFilesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_VerifyFilesActionPerformed
        OpenTransactionAccount otAccount = new OpenTransactionAccount();
        int isSuccess = otAccount.verifyFiles(jTextField_ServerID.getText(), jTextField_NymID.getText(), jTextField_AccountID.getText());
        if (isSuccess == 0) {
            JOptionPane.showMessageDialog(null, "The intermediary files for this account have all been VERIFIED against the last signed receipt", "Verified", JOptionPane.INFORMATION_MESSAGE);
        } else if (isSuccess == 1) {
            JOptionPane.showMessageDialog(null, "The intermediary files for this account have FAILED to verify against the last signed receipt", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (isSuccess == 2) {
            JOptionPane.showMessageDialog(null, "There is no receipt for this account", "Empty", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton_VerifyFilesActionPerformed

    private void jButton_InActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_InActionPerformed
        try {
            OpenTransactionAccount otAccount = new OpenTransactionAccount();
            String basket = otAccount.showBasket(jTextField_ServerID.getText(), jTextField_NymID.getText(), jTextField_AssetID.getText());
            if (basket != null && basket.length() > 0) {
                new ExchangeBasketDialog(null, true, basket, true, jTextField_ServerID.getText(), jTextField_NymID.getText(), jTextField_AccountID.getText(), jTextField_AssetID.getText()).setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Error getting basket curreny list", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(OpenTransactionAccountTopPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton_InActionPerformed

    private void jButton_OutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_OutActionPerformed
        try {
            OpenTransactionAccount otAccount = new OpenTransactionAccount();
            String basket = otAccount.showBasket(jTextField_ServerID.getText(), jTextField_NymID.getText(), jTextField_AssetID.getText());
            if (basket != null && basket.length() > 0) {
                new ExchangeBasketDialog(null, true, basket, false, jTextField_ServerID.getText(), jTextField_NymID.getText(), jTextField_AccountID.getText(), jTextField_AssetID.getText()).setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Error getting basket curreny list", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(OpenTransactionAccountTopPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton_OutActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler10;
    private javax.swing.Box.Filler filler11;
    private javax.swing.Box.Filler filler12;
    private javax.swing.Box.Filler filler13;
    private javax.swing.Box.Filler filler14;
    private javax.swing.Box.Filler filler15;
    private javax.swing.Box.Filler filler16;
    private javax.swing.Box.Filler filler17;
    private javax.swing.Box.Filler filler18;
    private javax.swing.Box.Filler filler19;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler20;
    private javax.swing.Box.Filler filler21;
    private javax.swing.Box.Filler filler22;
    private javax.swing.Box.Filler filler23;
    private javax.swing.Box.Filler filler24;
    private javax.swing.Box.Filler filler25;
    private javax.swing.Box.Filler filler3;
    private javax.swing.Box.Filler filler4;
    private javax.swing.Box.Filler filler5;
    private javax.swing.Box.Filler filler6;
    private javax.swing.Box.Filler filler7;
    private javax.swing.Box.Filler filler8;
    private javax.swing.Box.Filler filler9;
    private javax.swing.JButton jButton_DepositCash;
    private javax.swing.JButton jButton_DepositCheque;
    private javax.swing.JButton jButton_DownloadAccountFiles;
    private javax.swing.JButton jButton_In;
    private javax.swing.JButton jButton_Out;
    private javax.swing.JButton jButton_PurchaseVoucher;
    private javax.swing.JButton jButton_SendTransfer;
    private javax.swing.JButton jButton_VerifyFiles;
    private javax.swing.JButton jButton_WithdrawCash;
    private javax.swing.JButton jButton_WriteCheque;
    private javax.swing.JLabel jLabel_AccountID;
    private javax.swing.JLabel jLabel_AccountName;
    private javax.swing.JLabel jLabel_AssetID;
    private javax.swing.JLabel jLabel_AssetTypeName;
    private static javax.swing.JLabel jLabel_BasketName;
    private javax.swing.JLabel jLabel_CurrentBalance;
    private javax.swing.JLabel jLabel_NymID;
    private javax.swing.JLabel jLabel_NymName;
    private javax.swing.JLabel jLabel_ServerID;
    private javax.swing.JLabel jLabel_ServerName;
    private javax.swing.JLabel jLabel_basket;
    private javax.swing.JPanel jPanel_AccountActions;
    private static javax.swing.JPanel jPanel_AccountBasket;
    private javax.swing.JPanel jPanel_UpdateChecActions;
    private static javax.swing.JTextField jTextField_AccountID;
    private static javax.swing.JTextField jTextField_AccountName;
    private static javax.swing.JTextField jTextField_AssetID;
    private static javax.swing.JTextField jTextField_AssetName;
    private static javax.swing.JTextField jTextField_Balance;
    private static javax.swing.JTextField jTextField_NymID;
    private static javax.swing.JTextField jTextField_NymName;
    private static javax.swing.JTextField jTextField_ServerID;
    private static javax.swing.JTextField jTextField_ServerName;
    // End of variables declaration//GEN-END:variables

    public static void populateOTDetails(OTDetails otDetails) {

        jTextField_Balance.setText(otDetails.getBalance());
        jTextField_AccountID.setText(otDetails.getAccountID());
        jTextField_AssetID.setText(otDetails.getAssetID());
        jTextField_ServerID.setText(otDetails.getServerID());
        jTextField_NymID.setText(otDetails.getNymID());
        jTextField_AccountName.setText(otDetails.getAccountName());
        jTextField_ServerName.setText(otDetails.getServerName());
        jTextField_AssetName.setText(otDetails.getAssetName());
        jTextField_NymName.setText(otDetails.getNymName());

        if (Utility.VerifyStringVal(otDetails.getBasketName())) {
            System.out.println("otDetails.getBasketName():"+otDetails.getBasketName());
            jPanel_AccountBasket.setVisible(true);
            jLabel_BasketName.setToolTipText(otDetails.getBasketName());
            jLabel_BasketName.setText(otDetails.getBasketName());
        } else {
            jPanel_AccountBasket.setVisible(false);
        }

        jTextField_Balance.setCaretPosition(0);
        jTextField_AccountID.setCaretPosition(0);
        jTextField_AssetID.setCaretPosition(0);
        jTextField_ServerID.setCaretPosition(0);
        jTextField_NymID.setCaretPosition(0);
        jTextField_AccountName.setCaretPosition(0);
        jTextField_ServerName.setCaretPosition(0);
        jTextField_AssetName.setCaretPosition(0);
        jTextField_NymName.setCaretPosition(0);



    }

    public static void clearPanel() {

        if (jTextField_Balance != null && jTextField_AccountName != null && jTextField_ServerName != null
                && jTextField_AssetName != null && jTextField_NymName != null && jTextField_AccountID != null
                && jTextField_AssetID != null && jTextField_ServerID != null && jTextField_NymID != null) {
            jTextField_Balance.setText("");
            jTextField_AccountName.setText("");
            jTextField_ServerName.setText("");
            jTextField_AssetName.setText("");
            jTextField_NymName.setText("");
            jTextField_AccountID.setText("");
            jTextField_AssetID.setText("");
            jTextField_ServerID.setText("");
            jTextField_NymID.setText("");
        }
    }
}
