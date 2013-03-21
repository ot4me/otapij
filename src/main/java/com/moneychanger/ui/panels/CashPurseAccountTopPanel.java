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
 * CashPurseAccountTopPanel.java
 *
 * Created on 16 Apr, 2011, 2:01:03 AM
 */

package com.moneychanger.ui.panels;

import com.moneychanger.core.dataobjects.CashPurseDetails;
import com.moneychanger.ui.dialogs.ImportCashPurse;

/**
 *
 * @author Vicky C
 */
public class CashPurseAccountTopPanel extends javax.swing.JPanel {

    /** Creates new form CashPurseAccountTopPanel */
    public CashPurseAccountTopPanel() {
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

        filler7 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        filler8 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        jLabel_Account = new javax.swing.JLabel();
        jTextField_Account = new javax.swing.JTextField();
        jButton_Import = new javax.swing.JButton();
        filler9 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        filler10 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        filler11 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        jPanel_AssetInfo = new javax.swing.JPanel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        jLabel_AssetType = new javax.swing.JLabel();
        jTextField_AssetType = new javax.swing.JTextField();
        jLabel_AssetTypeID = new javax.swing.JLabel();
        jTextField_AssetTypeID = new javax.swing.JTextField();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        jLabel_Server = new javax.swing.JLabel();
        jTextField_Server = new javax.swing.JTextField();
        jLabel_ServerID = new javax.swing.JLabel();
        jTextField_ServerID = new javax.swing.JTextField();
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        filler5 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        jLabel_Nym = new javax.swing.JLabel();
        jTextField_Nym = new javax.swing.JTextField();
        jLabel_NymID = new javax.swing.JLabel();
        jTextField_NymID = new javax.swing.JTextField();
        filler6 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        filler12 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        filler13 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        filler14 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        jLabel_Purse = new javax.swing.JLabel();
        jScrollPane_Purse = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        filler15 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        filler16 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));

        setName("Form"); // NOI18N
        setLayout(new java.awt.GridBagLayout());

        filler7.setName("filler7"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weighty = 2.0;
        add(filler7, gridBagConstraints);

        filler8.setName("filler8"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        add(filler8, gridBagConstraints);

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance().getContext().getResourceMap(CashPurseAccountTopPanel.class);
        jLabel_Account.setText(resourceMap.getString("jLabel_Account.text")); // NOI18N
        jLabel_Account.setMaximumSize(new java.awt.Dimension(100, 14));
        jLabel_Account.setMinimumSize(new java.awt.Dimension(30, 14));
        jLabel_Account.setName("jLabel_Account"); // NOI18N
        jLabel_Account.setPreferredSize(new java.awt.Dimension(50, 14));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(jLabel_Account, gridBagConstraints);

        jTextField_Account.setEditable(false);
        jTextField_Account.setName("jTextField_Account"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 20.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(jTextField_Account, gridBagConstraints);

        jButton_Import.setText(resourceMap.getString("jButton_Import.text")); // NOI18N
        jButton_Import.setName("jButton_Import"); // NOI18N
        jButton_Import.setPreferredSize(new java.awt.Dimension(75, 23));
        jButton_Import.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ImportActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.RELATIVE;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(jButton_Import, gridBagConstraints);

        filler9.setName("filler9"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        add(filler9, gridBagConstraints);

        filler10.setName("filler10"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weighty = 1.0;
        add(filler10, gridBagConstraints);

        filler11.setName("filler11"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        add(filler11, gridBagConstraints);

        jPanel_AssetInfo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel_AssetInfo.setName("jPanel_AssetInfo"); // NOI18N
        jPanel_AssetInfo.setLayout(new java.awt.GridBagLayout());

        filler1.setName("filler1"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel_AssetInfo.add(filler1, gridBagConstraints);

        jLabel_AssetType.setText(resourceMap.getString("jLabel_AssetType.text")); // NOI18N
        jLabel_AssetType.setName("jLabel_AssetType"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel_AssetInfo.add(jLabel_AssetType, gridBagConstraints);

        jTextField_AssetType.setBackground(resourceMap.getColor("jTextField_AssetType.background")); // NOI18N
        jTextField_AssetType.setEditable(false);
        jTextField_AssetType.setName("jTextField_AssetType"); // NOI18N
        jTextField_AssetType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_AssetTypeActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel_AssetInfo.add(jTextField_AssetType, gridBagConstraints);

        jLabel_AssetTypeID.setText(resourceMap.getString("jLabel_AssetTypeID.text")); // NOI18N
        jLabel_AssetTypeID.setName("jLabel_AssetTypeID"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel_AssetInfo.add(jLabel_AssetTypeID, gridBagConstraints);

        jTextField_AssetTypeID.setEditable(false);
        jTextField_AssetTypeID.setName("jTextField_AssetTypeID"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel_AssetInfo.add(jTextField_AssetTypeID, gridBagConstraints);

        filler2.setName("filler2"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel_AssetInfo.add(filler2, gridBagConstraints);

        filler3.setName("filler3"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel_AssetInfo.add(filler3, gridBagConstraints);

        jLabel_Server.setText(resourceMap.getString("jLabel_Server.text")); // NOI18N
        jLabel_Server.setName("jLabel_Server"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel_AssetInfo.add(jLabel_Server, gridBagConstraints);

        jTextField_Server.setBackground(resourceMap.getColor("jTextField_Server.background")); // NOI18N
        jTextField_Server.setEditable(false);
        jTextField_Server.setName("jTextField_Server"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel_AssetInfo.add(jTextField_Server, gridBagConstraints);

        jLabel_ServerID.setText(resourceMap.getString("jLabel_ServerID.text")); // NOI18N
        jLabel_ServerID.setName("jLabel_ServerID"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel_AssetInfo.add(jLabel_ServerID, gridBagConstraints);

        jTextField_ServerID.setEditable(false);
        jTextField_ServerID.setName("jTextField_ServerID"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel_AssetInfo.add(jTextField_ServerID, gridBagConstraints);

        filler4.setName("filler4"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel_AssetInfo.add(filler4, gridBagConstraints);

        filler5.setName("filler5"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel_AssetInfo.add(filler5, gridBagConstraints);

        jLabel_Nym.setText(resourceMap.getString("jLabel_Nym.text")); // NOI18N
        jLabel_Nym.setName("jLabel_Nym"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel_AssetInfo.add(jLabel_Nym, gridBagConstraints);

        jTextField_Nym.setBackground(resourceMap.getColor("jTextField_Nym.background")); // NOI18N
        jTextField_Nym.setEditable(false);
        jTextField_Nym.setName("jTextField_Nym"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel_AssetInfo.add(jTextField_Nym, gridBagConstraints);

        jLabel_NymID.setText(resourceMap.getString("jLabel_NymID.text")); // NOI18N
        jLabel_NymID.setName("jLabel_NymID"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel_AssetInfo.add(jLabel_NymID, gridBagConstraints);

        jTextField_NymID.setEditable(false);
        jTextField_NymID.setName("jTextField_NymID"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel_AssetInfo.add(jTextField_NymID, gridBagConstraints);

        filler6.setName("filler6"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel_AssetInfo.add(filler6, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.RELATIVE;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 10.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(jPanel_AssetInfo, gridBagConstraints);

        filler12.setName("filler12"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        add(filler12, gridBagConstraints);

        filler13.setName("filler13"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weighty = 1.0;
        add(filler13, gridBagConstraints);

        filler14.setName("filler14"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        add(filler14, gridBagConstraints);

        jLabel_Purse.setText(resourceMap.getString("jLabel_Purse.text")); // NOI18N
        jLabel_Purse.setName("jLabel_Purse"); // NOI18N
        jLabel_Purse.setPreferredSize(new java.awt.Dimension(75, 14));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(jLabel_Purse, gridBagConstraints);

        jScrollPane_Purse.setName("jScrollPane_Purse"); // NOI18N

        jTextArea1.setColumns(20);
        jTextArea1.setEditable(false);
        jTextArea1.setRows(5);
        jTextArea1.setName("jTextArea1"); // NOI18N
        jTextArea1.setPreferredSize(new java.awt.Dimension(300, 200));
        jScrollPane_Purse.setViewportView(jTextArea1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.RELATIVE;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 20.0;
        gridBagConstraints.weighty = 40.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(jScrollPane_Purse, gridBagConstraints);

        filler15.setName("filler15"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        add(filler15, gridBagConstraints);

        filler16.setName("filler16"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weighty = 2.0;
        add(filler16, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_AssetTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_AssetTypeActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_jTextField_AssetTypeActionPerformed

    private void jButton_ImportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ImportActionPerformed
        new ImportCashPurse(null, true, jTextField_ServerID.getText(), jTextField_NymID.getText(), jTextField_AssetTypeID.getText(),jTextArea1.getText()).setVisible(true);
    }//GEN-LAST:event_jButton_ImportActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler10;
    private javax.swing.Box.Filler filler11;
    private javax.swing.Box.Filler filler12;
    private javax.swing.Box.Filler filler13;
    private javax.swing.Box.Filler filler14;
    private javax.swing.Box.Filler filler15;
    private javax.swing.Box.Filler filler16;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.Box.Filler filler4;
    private javax.swing.Box.Filler filler5;
    private javax.swing.Box.Filler filler6;
    private javax.swing.Box.Filler filler7;
    private javax.swing.Box.Filler filler8;
    private javax.swing.Box.Filler filler9;
    private javax.swing.JButton jButton_Import;
    private javax.swing.JLabel jLabel_Account;
    private javax.swing.JLabel jLabel_AssetType;
    private javax.swing.JLabel jLabel_AssetTypeID;
    private javax.swing.JLabel jLabel_Nym;
    private javax.swing.JLabel jLabel_NymID;
    private javax.swing.JLabel jLabel_Purse;
    private javax.swing.JLabel jLabel_Server;
    private javax.swing.JLabel jLabel_ServerID;
    private javax.swing.JPanel jPanel_AssetInfo;
    private javax.swing.JScrollPane jScrollPane_Purse;
    private static javax.swing.JTextArea jTextArea1;
    private static javax.swing.JTextField jTextField_Account;
    private static javax.swing.JTextField jTextField_AssetType;
    private static javax.swing.JTextField jTextField_AssetTypeID;
    private static javax.swing.JTextField jTextField_Nym;
    private static javax.swing.JTextField jTextField_NymID;
    private static javax.swing.JTextField jTextField_Server;
    private static javax.swing.JTextField jTextField_ServerID;
    // End of variables declaration//GEN-END:variables
public static void populateCashPurseDetails(CashPurseDetails cashPurseDetails,String balance) {
        jTextField_Account.setText(balance);
        jTextField_AssetType.setText(cashPurseDetails.getAssetType());
        jTextField_Server.setText(cashPurseDetails.getServeName());
        jTextField_Nym.setText(cashPurseDetails.getNymName());
        jTextField_AssetTypeID.setText(cashPurseDetails.getAssetID());
        jTextField_ServerID.setText(cashPurseDetails.getServerID());
        jTextField_NymID.setText(cashPurseDetails.getNymID());
        jTextArea1.setText(cashPurseDetails.getPurse());
        jTextArea1.setCaretPosition(0);
    }

    public static void clearPanel() {
        System.out.println("In clearPanel cash top");
        if (jTextArea1 != null && jTextField_AssetType != null && jTextField_Server != null
                && jTextField_Nym != null && jTextField_AssetTypeID != null
                && jTextField_ServerID != null && jTextField_NymID != null && jTextField_Account != null) {
            jTextArea1.setText("");
            jTextField_AssetType.setText("");
            jTextField_Server.setText("");
            jTextField_Nym.setText("");
            jTextField_AssetTypeID.setText("");
            jTextField_ServerID.setText("");
            jTextField_NymID.setText("");
            jTextField_Account.setText("");
        }
    }
}
