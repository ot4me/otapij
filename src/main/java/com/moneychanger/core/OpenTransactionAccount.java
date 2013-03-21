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
package com.moneychanger.core;

import com.moneychanger.core.dataobjects.OTDetails;
import com.moneychanger.core.util.Configuration;
import com.moneychanger.core.util.OTAPI_Func;
import com.moneychanger.core.util.Helpers;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.opentransactions.jni.core.otapi;
import org.opentransactions.jni.core.otapiJNI;
import org.opentransactions.otjavalib.util.Utility;

// *********************************************************
/**
 *
 * @author Vicky C
 * 
 * Rewrites: FT -- Lots of refactoring. I wrote the above class, and re-used it
 * as much as possible in all the code below, to reduce its size and complexity.
 */
public class OpenTransactionAccount extends Account {

    private String serverID;
    private String nymID;
    private String assetID;
    private String label;

    public OpenTransactionAccount() {

        type = "OpenTransactionAccount";
    }

    public OpenTransactionAccount(String serverID, String nymID, String assetID, String label) {
        type = "OpenTransactionAccount";
        this.serverID = serverID;
        this.nymID = nymID;
        this.assetID = assetID;
        this.label = label;
    }

    public OpenTransactionAccount(String serverID, String nymID) {
        type = "OpenTransactionAccount";
        this.serverID = serverID;
        this.nymID = nymID;
    }

    private boolean createAssetAccount(String serverID, String nymID, String assetID) {

        OTAPI_Func theRequest = new OTAPI_Func(OTAPI_Func.FT.CREATE_ASSET_ACCT, serverID, nymID, assetID);
        String strResponse = OTAPI_Func.SendRequest(theRequest, "CREATE_ASSET_ACCT");

        if (!Utility.VerifyStringVal(strResponse)) {
            System.out.println("IN createAssetAccount: OTAPI_Func.SendRequest(() failed. (I give up.) ");
            return false;
        }
        // ----------------------------------------------------------

        String strNewAcctID = otapiJNI.OTAPI_Basic_Message_GetNewAcctID(strResponse);

        otapiJNI.OTAPI_Basic_SetAccountWallet_Name(strNewAcctID, nymID, label);

        // When you first create an asset account you need to get a copy of the outbox.
        // (Or create an empty one, which would save us sending the message here. Todo.)
        //
        Utility.OTBool bWasMsgSent = new Utility.OTBool (false);
        Helpers.getOutboxLowLevel(serverID, nymID, strNewAcctID, bWasMsgSent, true);
        // ----------------------------------------------------------

        return true;
    }

    @Override
    public boolean createAccount() {
        boolean bSuccess = false;
        System.out.println("IN createAccount serverID:" + serverID + " nymID: " + nymID + " assetID:" + assetID);
        try {
            // If the Nym's not registered at the server, we do that first...
            //
            if (!otapiJNI.OTAPI_Basic_IsNym_RegisteredAtServer(nymID, serverID)) {

                OTAPI_Func theRequest = new OTAPI_Func(OTAPI_Func.FT.CREATE_USER_ACCT, serverID, nymID);
                String strResponse = OTAPI_Func.SendRequest(theRequest, "CREATE_USER_ACCT");

                if (!Utility.VerifyStringVal(strResponse)) {
                    System.out.println("IN createAccount: OTAPI_Func.SendRequest(() failed. (I give up.) ");
                    return false;
                }
                // ---------------
                // Create_User_Acct should ALWAYS succeed (since the server succeeds no matter what,
                // to prevent sync issues.) Therefore I feel *somewhat* safe in going ahead here
                // and calling Utility.getRequestNumber(), since this is a brand new Nym and will
                // need to sync it for the first time, in order to do any other messages.
                if (Helpers.getRequestNumber(serverID, nymID) < 1) {
                    System.out.println("In createAccount: Failure to call getRequestNumber() after supposedly creating user acct at server.");
                    //return false; // commenting this out, so for moa7 types with bad connections, even if this call fails, it'll go ahead and try the next one, and when THAT fails it does another getRequestNumber followed by a retry. So we have plenty of chances to succeed here...
                }
            }
            // -----------------------------------------------
            // Okay the Nym is definitely registered at the server, so let's 
            // create the asset account...
            //
            bSuccess = createAssetAccount(serverID, nymID, assetID);

            if (bSuccess) {
                System.out.println("In createAccount: Success");
            } else {
                System.out.println("In createAccount: Failure");
            }
        } catch (Exception e) {
//          e.printStackTrace();
            System.out.println("In Exception");
            return false;
        }
        return bSuccess;
    }

    @Override
    public boolean deleteAccount(String accountID) throws Exception {

        boolean deleteAccount = otapiJNI.OTAPI_Basic_Wallet_CanRemoveAccount(accountID);

        if (!deleteAccount) {
            System.out.println("deleteAccount: unable. There must still be open receipts, or a nonzero balance?");
            return false;
        }
        // ----------------------------------------

        OTAPI_Func theRequest = new OTAPI_Func(OTAPI_Func.FT.DELETE_ASSET_ACCT, serverID, nymID, accountID);
        String strResponse = OTAPI_Func.SendRequest(theRequest, "DELETE_ASSET_ACCT");

        if (!Utility.VerifyStringVal(strResponse)) {
            System.out.println("IN deleteAccount: OTAPI_Func.SendRequest(() failed. (I give up.) ");
            return false;
        }
        // ----------------------------------------

        // BY THIS POINT, we successfully deleted the account from the server.
        // Now we just need to remove it from the wallet (todo).

        // TODO
        //deleteAccount = otapiJNI.OTAPI_Basic_Wallet_RemoveAccount(accountID) == 1 ? true : false;
        System.out.println("IN deleteAccount: THIS IS THE SPOT WHERE, THE **DELETE ACCOUNT** MESSAGE TO THE SERVER WAS SUCCESSFUL, THREFORE WE CAN GO AHEAD AND DELETE THE LOCAL ONE AS WELL. (TODO.)");
        return true;
    }

    @Override
    public void editAccount() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Map getAccounts(String accountID, String serverID) {
        return getAccountsForAssetServer(otapiJNI.OTAPI_Basic_GetAccountWallet_AssetTypeID(accountID), serverID);
    }

    public Map getAccountsForAssetServer(String assetID, String serverID) {

        Map account = new HashMap();
        int count = otapiJNI.OTAPI_Basic_GetAccountCount();
        int j = 0;
        for (int i = 0; i < count; i++) {
            String accountID = otapiJNI.OTAPI_Basic_GetAccountWallet_ID(i);
            if (assetID.equals(otapiJNI.OTAPI_Basic_GetAccountWallet_AssetTypeID(accountID))
                    && serverID.equals(otapiJNI.OTAPI_Basic_GetAccountWallet_ServerID(accountID))) {
                account.put((j), new String[]{otapiJNI.OTAPI_Basic_GetAccountWallet_Name(accountID), accountID});
                j++;
            }
        }

        return account;
    }

    public Map getAccounts(String assetID, String nymID, String serverID) {

        System.out.println("In getAccounts,assetID:" + assetID + " nymID:" + nymID + " serverID:" + serverID);

        Map account = new HashMap();
        int count = otapiJNI.OTAPI_Basic_GetAccountCount();
        int j = 0;
        for (int i = 0; i < count; i++) {
            String accountID = otapiJNI.OTAPI_Basic_GetAccountWallet_ID(i);
            if (assetID.equals(otapiJNI.OTAPI_Basic_GetAccountWallet_AssetTypeID(accountID))
                    && serverID.equals(otapiJNI.OTAPI_Basic_GetAccountWallet_ServerID(accountID))
                    && nymID.equals(otapiJNI.OTAPI_Basic_GetAccountWallet_NymID(accountID))) {
                account.put((j), new String[]{otapiJNI.OTAPI_Basic_GetAccountWallet_Name(accountID), accountID});
                j++;
            }
        }

        return account;
    }

    public Map getAccountID(String serverID, String nymID, String assetID) {

        int count = otapiJNI.OTAPI_Basic_GetAccountCount();

        Map accounts = new HashMap();

        if (!Utility.VerifyStringVal(assetID) && !Utility.VerifyStringVal(nymID) && !Utility.VerifyStringVal(serverID)) {
            System.out.println("In getAccountID:  nymID:" + nymID + " serverID:" + serverID);
            return null;
        }
        int j = 0;
        for (int i = 0; i < count; i++) {
            String accountID = otapiJNI.OTAPI_Basic_GetAccountWallet_ID(i);

            if (!Utility.VerifyStringVal(accountID)) {
                continue;
            }
            if (Utility.VerifyStringVal(assetID)
                    && assetID.equals(otapiJNI.OTAPI_Basic_GetAccountWallet_AssetTypeID(accountID))
                    && Utility.VerifyStringVal(serverID)
                    && serverID.equals(otapiJNI.OTAPI_Basic_GetAccountWallet_ServerID(accountID))
                    && Utility.VerifyStringVal(nymID) && nymID.equals(otapiJNI.OTAPI_Basic_GetAccountWallet_NymID(accountID))) {
                accounts.put((j), new String[]{otapiJNI.OTAPI_Basic_GetAccountWallet_Name(accountID), accountID});
                j++;
            }

        }

        return accounts;


    }

    public boolean exchangeBasket(String assetID, String serverID, String nymID, String basket, boolean inXchange, int memberCount, String accountID) {

        String IN_FUNCTION = new String("exchangeBasket");
        System.out.println("In " + IN_FUNCTION + " serverID:" + serverID + " accountID:" + accountID + " nymID:" + nymID + " assetID:" + assetID + " basket:" + basket + " inXchange is " + inXchange + " memberCount:" + memberCount);

        // ----------------------------------------
        OTAPI_Func theRequest = new OTAPI_Func(OTAPI_Func.FT.EXCHANGE_BASKET, serverID, nymID, assetID, basket, accountID, inXchange, (memberCount + 2));
        String strResponse = OTAPI_Func.SendTransaction(theRequest, "EXCHANGE_BASKET");

        if (!Utility.VerifyStringVal(strResponse)) {
            System.out.println("IN exchangeBasket: OTAPI_Func.SendTransaction(() failed. (I give up.) ");
            return false;
        }
        // ----------------------------------------

        return true;
    }

    public void getOTAccountList(String assetID, String serverID, String nymID) {

        int count = otapiJNI.OTAPI_Basic_GetAccountCount();

        for (int i = 0; i < count; i++) {
            String accountID = otapiJNI.OTAPI_Basic_GetAccountWallet_ID(i);
            if (!Utility.VerifyStringVal(accountID)) {
                continue;
            }
            if (!"ALL".equalsIgnoreCase(assetID)) {
                if (!Utility.VerifyStringVal(assetID) || !assetID.equals(otapiJNI.OTAPI_Basic_GetAccountWallet_AssetTypeID(accountID))) {
                    continue;
                }
            }

            if (!"ALL".equalsIgnoreCase(serverID)) {
                if (!Utility.VerifyStringVal(serverID) || !serverID.equals(otapiJNI.OTAPI_Basic_GetAccountWallet_ServerID(accountID))) {
                    continue;
                }
            }
            if (!"ALL".equalsIgnoreCase(nymID)) {
                if (Utility.VerifyStringVal(nymID) && nymID.equals(otapiJNI.OTAPI_Basic_GetAccountWallet_NymID(accountID))) {
                    key = accountID;
                    label = otapiJNI.OTAPI_Basic_GetAccountWallet_Name(accountID);
                    amount = otapiJNI.OTAPI_Basic_GetAccountWallet_Balance(accountID);
                    accountListOT.put(key, new String[]{label, amount, type, key});
                }
            } else {
                key = accountID;
                label = otapiJNI.OTAPI_Basic_GetAccountWallet_Name(accountID);
                amount = otapiJNI.OTAPI_Basic_GetAccountWallet_Balance(accountID);
                accountListOT.put(key, new String[]{label, amount, type, key});
            }

        }
    }

    public boolean editLabel(String accountID, String newLabel) {
        String nymID = otapiJNI.OTAPI_Basic_GetAccountWallet_NymID(accountID);
        if (!Utility.VerifyStringVal(nymID)) {
            return false;
        }
        return otapiJNI.OTAPI_Basic_SetAccountWallet_Name(accountID, nymID, newLabel);
    }

    public OTDetails getOTAccountDetails(String accountID) {

        System.out.println("In getOTAccountDetails: ");

        OTDetails otDetails = new OTDetails();

        if (!Utility.VerifyStringVal(accountID)) {
            System.out.println("Failure: accountID is null.");
            return otDetails;
        }
        // ---------------------------------------------

        otDetails.setAccountID(accountID);

        // ---------------------------------------------
        String strServerID = otapiJNI.OTAPI_Basic_GetAccountWallet_ServerID(accountID);
        if (!Utility.VerifyStringVal(strServerID)) {
            System.out.println("Failure: serverID is null for accountID: " + accountID);
            return otDetails;
        }
        otDetails.setServerID(strServerID);

        String serverName = otapiJNI.OTAPI_Basic_GetServer_Name(strServerID);
        if (!Utility.VerifyStringVal(serverName)) {
            System.out.println("Failure: serverName is null for serverID: " + strServerID);
            return otDetails;
        }
        otDetails.setServerName(serverName);
        // ---------------------------------------------
        String strAssetID = otapiJNI.OTAPI_Basic_GetAccountWallet_AssetTypeID(accountID);

        if (!Utility.VerifyStringVal(strAssetID)) {
            System.out.println("Failure: assetID is null for accountID: " + accountID);
            return otDetails;
        }
        otDetails.setAssetID(strAssetID);

        String assetName = otapiJNI.OTAPI_Basic_GetAssetType_Name(strAssetID);

        if (!Utility.VerifyStringVal(assetName)) {
            System.out.println("Failure: assetName is null for assetID: " + strAssetID);
            return otDetails;
        }
        otDetails.setAssetName(assetName);
        // ---------------------------------------------
        String strAccountName = otapiJNI.OTAPI_Basic_GetAccountWallet_Name(accountID);

        if (!Utility.VerifyStringVal(strAccountName)) {
            System.out.println("Failure: strAccountName is null for accountID: " + accountID);
            return otDetails;
        }
        otDetails.setAccountName(strAccountName);
        // ---------------------------------------------
        String strNymID = otapiJNI.OTAPI_Basic_GetAccountWallet_NymID(accountID);

        if (!Utility.VerifyStringVal(strNymID)) {
            System.out.println("Failure: nymID is null for accountID: " + accountID);
            return otDetails;
        }
        otDetails.setNymID(strNymID);

        String strNymName = !Utility.VerifyStringVal(strNymID) ? "" : otapiJNI.OTAPI_Basic_GetNym_Name(strNymID);

        if (!Utility.VerifyStringVal(strNymName)) {
            System.out.println("Failure: strNymName is null for nymID: " + strNymID);
            return otDetails;
        }
        otDetails.setNymName(strNymName);
        // ----------------------------------        
        try {
            if (Helpers.getIntermediaryFiles(strServerID, strNymID, accountID)) {
                otDetails.setInboxData(getInboxData(accountID));
                otDetails.setOutboxData(getOutboxData(accountID));
            } else {
                System.out.println("getOTAccountDetails: Failed in Utility.getIntermediaryFiles()");
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(OpenTransactionAccount.class.getName()).log(Level.SEVERE, null, ex);
        }
        // ----------------------------------
        String strBalance = otapiJNI.OTAPI_Basic_GetAccountWallet_Balance(accountID);

        if (!Utility.VerifyStringVal(strBalance)) {
            System.out.println("Failure: strBalance is null for accountID: " + accountID);
            return otDetails;
        }
        otDetails.setBalance(strBalance);
        // ---------------------------------------------
        
        if (otapiJNI.OTAPI_Basic_IsBasketCurrency(otapiJNI.OTAPI_Basic_GetAccountWallet_AssetTypeID(accountID))) {
            otDetails.setBasketName(otapiJNI.OTAPI_Basic_GetAssetType_Name(otapiJNI.OTAPI_Basic_GetAccountWallet_AssetTypeID(accountID)) == null ? ""
                    : otapiJNI.OTAPI_Basic_GetAssetType_Name(otapiJNI.OTAPI_Basic_GetAccountWallet_AssetTypeID(accountID)));
        }

        return otDetails;
    }

    public String getExchangeBasketRequest(String serverID, String nymID, String assetID, String accountID, int multiple) {

        System.out.println("exchangeBasketRequest, serverID:" + serverID + " nymID:" + nymID + " assetID:" + assetID + " accountID:" + accountID + " multiple:" + multiple);

        String basketExchangeRequest = otapiJNI.OTAPI_Basic_GenerateBasketExchange(serverID, nymID, assetID, accountID, multiple);

        if (!Utility.VerifyStringVal(basketExchangeRequest)) {
            System.out.println(" exchangeBasketRequest - OT_API_GenerateBasketExchange returned null");
            return null;
        }

        return basketExchangeRequest;
    }

    public String showBasket(String serverID, String nymID, String assetID) throws InterruptedException {

        if (!Utility.VerifyStringVal(otapiJNI.OTAPI_Basic_LoadAssetContract(assetID))) {
            System.out.println("IN showBasket, OT_API_LoadAssetContract is null");

            // ----------------------------------------
            OTAPI_Func theRequest = new OTAPI_Func(OTAPI_Func.FT.GET_CONTRACT, serverID, nymID, assetID);
            String strResponse = OTAPI_Func.SendRequest(theRequest, "GET_CONTRACT");

            if (!Utility.VerifyStringVal(strResponse)) {
                System.out.println("IN showBasket: OTAPI_Func.SendRequest(() failed. (I give up.) ");
                return null;
            }
        }
        // ----------------------------------------

        StringBuilder basket = new StringBuilder();

        String minTransferAmt = otapiJNI.OTAPI_Basic_Basket_GetMinimumTransferAmount(assetID);
        String assetName = otapiJNI.OTAPI_Basic_GetAssetType_Name(assetID);

        System.out.println("showBasket --minTransferAmt:" + minTransferAmt + " assetName:" + assetName);

        basket.append(minTransferAmt);
        basket.append(" ");
        basket.append(assetName);
        basket.append(" == ");

        int basketMemberCount = otapiJNI.OTAPI_Basic_Basket_GetMemberCount(assetID);

        System.out.println("showBasket --basketMemberCount:" + basketMemberCount);
        for (int i = 0; i < basketMemberCount; i++) {
            String memberAssetID = otapiJNI.OTAPI_Basic_Basket_GetMemberType(assetID, i);
            System.out.println("showBasket memberAssetID:" + memberAssetID);
            
            if (Utility.VerifyStringVal(memberAssetID)) {
                String minTransferAmtMember = otapiJNI.OTAPI_Basic_Basket_GetMemberMinimumTransferAmount(assetID, i);
                System.out.println("showBasket minTransferAmtMember:" + minTransferAmtMember);
                basket.append(minTransferAmtMember);
                basket.append(" ");
                basket.append(otapiJNI.OTAPI_Basic_GetAssetType_Name(memberAssetID));
                if (i != basketMemberCount - 1) {
                    basket.append(", ");
                }
            }
        }
        System.out.println("showBasket -- basket.toString():" + basket.toString());
        return basket.toString();
    }

    @Override
    public void loadAccount(String assetID, String serverID, String nymID) {

        System.out.println("In OT load");
        getOTAccountList(assetID, serverID, nymID);
        System.out.println("-----------accountList:" + accountListOT.entrySet());

    }

    @Override
    public Object getAccountDetails(String accountID) {
        return getOTAccountDetails(accountID);

    }

    
    
    public boolean processInbox(String accountID, Map selectedIndices) throws InterruptedException {

        String IN_FUNCTION = new String("OpenTransactionAccount.processInbox");
        
        System.out.println("Process Inbox starts");

        final String serverID = otapiJNI.OTAPI_Basic_GetAccountWallet_ServerID(accountID);
        final String nymID = otapiJNI.OTAPI_Basic_GetAccountWallet_NymID(accountID);

        final int nTransNumsNeeded = 1;
        
        // ------------------------------------------------------------------
        // Normally I could remove this code, since SendTransaction() (below)
        // does the work already, of grabbing new numbers when they're needed.
        // But in THIS case, I need those numbers BEFORE I send the transaction,
        // as I'm forming the message-ledger, and a number is reserved during
        // this time.
        // Specifically, inside the call to OT_API_Ledger_CreateResponse(), the
        // first time it is called for a specific processInbox() message, is when
        // the transaction # is grabbed from local storage for that message. If
        // it's not available, that call will fail.
        //
//        if (otapiJNI.OTAPI_Basic_GetNym_TransactionNumCount(serverID, nymID) < Configuration.getNbrTransactionCount()) {
//            if ((false == Utility.getTransactionNumbers(serverID, nymID))
//                    || (otapiJNI.OTAPI_Basic_GetNym_TransactionNumCount(serverID, nymID) < Configuration.getNbrTransactionCount())) {
//                System.out.println("In processInbox , failed to get transaction numbers, OT_API_GetNym_TransactionNumCount:" + otapiJNI.OTAPI_Basic_GetNym_TransactionNumCount(serverID, nymID));
//                return false;
//            }
//        }
        // ------------------------------------------------------------------
        
        
        
        
        
        // We won't download here unless we can see the hash has changed.
        // If it HAS, and our download fails, then we have failed.
        // (Can't sign any balance agreements anyway without that download...)
        //
        if (false == Helpers.getIntermediaryFiles(serverID,
                nymID, accountID, false)) // bForceDownload=false
        {
            System.out.println("In: " + IN_FUNCTION + ", getIntermediaryFiles returned false. (It couldn't download files that it needed.)");
            return false;
        }
        // -------------------------------------------------------

        
        // **********************************************************************
        // GET TRANSACTION NUMBERS HERE IF NECESSARY.
        //
        boolean bSure = true;

        if (otapiJNI.OTAPI_Basic_GetNym_TransactionNumCount(serverID, nymID)    // If the current trans# count is LESS than what's needed...
                <
                (nTransNumsNeeded > Configuration.getNbrTransactionCount() ?        //theFunction needs more than my normal minimum in my configuration
                    nTransNumsNeeded  : Configuration.getNbrTransactionCount()))    // Therefore I will grab that many, instead of however many I would normally grab.
        {
            System.out.println("In: " + IN_FUNCTION + ", I don't have enough transaction numbers to perform this transaction. Grabbing more now...");
            int configTxnCount = Configuration.getNbrTransactionCount();
            Configuration.setNbrTransactionCount((nTransNumsNeeded > configTxnCount) ? nTransNumsNeeded : configTxnCount);
            
            bSure = Helpers.getTransactionNumbers(serverID, nymID); // <====================== getTransactionNumbers
            
            Configuration.setNbrTransactionCount(configTxnCount);
        }
        // -------------------------------------
        
        if (
//              !bSure || 
                (otapiJNI.OTAPI_Basic_GetNym_TransactionNumCount(serverID, nymID) < nTransNumsNeeded))  // Try a second time.
        {
            System.out.println("In: " + IN_FUNCTION + ", first failure:  Utility.getTransactionNumbers. (Trying again...)");
            
            bSure = Helpers.getTransactionNumbers( serverID, nymID,    // Try a second time.        
                                                   false); // We tell getTransNumbers that it can skip the first call to getTransNumLowLevel        
        }
        // -------------------------------------
        if (
//              !bSure || 
                (otapiJNI.OTAPI_Basic_GetNym_TransactionNumCount(serverID, nymID) < nTransNumsNeeded))  // Try a third time.
        {
            System.out.println("In: " + IN_FUNCTION + ", second failure:  Utility.getTransactionNumbers. (Trying again...)");
            
            bSure = Helpers.getTransactionNumbers( serverID, nymID, // Try a third time.   
                                                   false); // We tell getTransNumbers that it can skip the first call to getTransNumLowLevel        
        }
        // -------------------------------------
        // Giving up if still a failure...
        //
        if (
//              !bSure || 
                (otapiJNI.OTAPI_Basic_GetNym_TransactionNumCount(serverID, nymID) < nTransNumsNeeded))
        {
            System.out.println("In: " + IN_FUNCTION + ", third failure. bSure: " + bSure + ". OT_API_GetNym_TransactionNumCount: " +
                    otapiJNI.OTAPI_Basic_GetNym_TransactionNumCount(serverID, nymID));
            return false;
        }
        
        // ------------------------------------------------------------------

        String ledger = otapiJNI.OTAPI_Basic_LoadInbox(serverID, nymID, accountID);

        // ------------------------------------------------------------------
        // SET UP THE PROCESS INBOX MESSAGE.

        String responseLedger = otapiJNI.OTAPI_Basic_Ledger_CreateResponse(serverID, nymID, accountID, ledger); // <=== Uses a transaction #, which must be available.

        if (!Utility.VerifyStringVal(responseLedger)) {
            System.out.println("OT_API_Ledger_CreateResponse returned responseLedger:" + responseLedger);
            return false;
        }
        // ------------------------
        int count = otapiJNI.OTAPI_Basic_Ledger_GetCount(serverID, nymID, accountID, ledger);

        boolean isInboxEmpty = true;
        for (int i = 0; i < count; i++) {
            if (selectedIndices.containsKey(String.valueOf(i))) {
                boolean selected = ((Boolean) selectedIndices.get(String.valueOf(i)));
                String transaction = otapiJNI.OTAPI_Basic_Ledger_GetTransactionByIndex(serverID, nymID, accountID, ledger, i);
                if (!Utility.VerifyStringVal(transaction)) {
                    System.out.println("transaction is null, skipping this record");
                    continue;
                }
                String strTemp = new String(responseLedger);
                responseLedger = otapiJNI.OTAPI_Basic_Transaction_CreateResponse(serverID, nymID, accountID, strTemp, transaction, selected);
                isInboxEmpty = false;
            }
        }

        if (isInboxEmpty) {
            System.out.println("Return False - reason isInboxEmpty - " + isInboxEmpty);
            return false;
        }
        // ------------------------

        if (!Utility.VerifyStringVal(responseLedger)) {
            System.out.println("Return False - reason responseLedger is null, from  OT_API_Transaction_CreateResponse.");
            return false;
        }

        String accountLedger = otapiJNI.OTAPI_Basic_Ledger_FinalizeResponse(serverID, nymID, accountID, responseLedger);

        if (!Utility.VerifyStringVal(accountLedger)) {
            System.out.println("Return False - reason accountLedger from  OT_API_Ledger_FinalizeResponse - " + accountLedger);
            return false;
        }

        // -------------------------------------------------------------------
        // SEND THE PROCESS INBOX MESSAGE (to server.)
        // ----------------------------------------

        OTAPI_Func theRequest = new OTAPI_Func(OTAPI_Func.FT.PROCESS_INBOX, serverID, nymID, accountID, accountLedger);
        String strResponse = OTAPI_Func.SendTransaction(theRequest, "PROCESS_INBOX");

        if (!Utility.VerifyStringVal(strResponse)) {
            System.out.println("IN processInbox: OTAPI_Func.SendTransaction(() failed. (I give up.) ");
            return false;
        }

        // -------------------------------------------------------------------

        // Since we just processed the inbox, let's grab the latest versions
        // of these files.
        // UPDATE: the caller already does this, so I think it's redundant.
        // UPDATE: I put it back in, except with a FORCE (true) so it definitely
        // downloads.
        // Update: removing again, though might add back in WITHOUT the force.
        //
//        boolean isSuccess = Utility.getInboxOutboxAccount(accountID, true); // download the data.        
//        if (false == Utility.getIntermediaryFiles(serverID, nymID, accountID, true)) {
//        if (false == Utility.getIntermediaryFiles(serverID, nymID, accountID)) {
//            System.out.println("processInbox: Error: getIntermediaryFiles returned false.");
//            return false;
//        }
        // -----------------------------------

        return true;
    }

    
    // **********************************************************************
    public Map getInboxData(String accountID) throws InterruptedException {

        Map data = new HashMap();

        if (!Utility.VerifyStringVal(accountID)) {
            return data;
        }

        String serverID = otapiJNI.OTAPI_Basic_GetAccountWallet_ServerID(accountID);
        String nymID = otapiJNI.OTAPI_Basic_GetAccountWallet_NymID(accountID);

        // The caller now does this.
//      Utility.getInboxAccount(serverID, nymID, accountID);

        String ledger = otapiJNI.OTAPI_Basic_LoadInbox(serverID, nymID, accountID);
        if (!Utility.VerifyStringVal(ledger)) {
            return data;
        }
        int count = otapiJNI.OTAPI_Basic_Ledger_GetCount(serverID, nymID, accountID, ledger);

        for (int i = 0; i < count; i++) {

            String transactionID = otapiJNI.OTAPI_Basic_Ledger_GetTransactionIDByIndex(serverID, nymID, accountID, ledger, i);


            String transaction = otapiJNI.OTAPI_Basic_Ledger_GetTransactionByIndex(serverID, nymID, accountID, ledger, i);


            if (!Utility.VerifyStringVal(transaction)) {
                System.out.println("Skip this record, since OT_API_Ledger_GetTransactionByIndex has returned null");
                continue;
            }
            String txnType = otapiJNI.OTAPI_Basic_Transaction_GetType(serverID, nymID, accountID, transaction);
            System.out.println("In Inbox, type of txn is :" + txnType);
            String amount = otapiJNI.OTAPI_Basic_Transaction_GetAmount(serverID, nymID, accountID, transaction);
            String referenceNumber = otapiJNI.OTAPI_Basic_Transaction_GetDisplayReferenceToNum(serverID, nymID, accountID, transaction);
            String timestamp = otapiJNI.OTAPI_Basic_Transaction_GetDateSigned(serverID, nymID, accountID, transaction);

            if (!Utility.VerifyStringVal(timestamp)) {
                timestamp = "";
            } else {
                try {
                    timestamp = String.valueOf(new Date(Long.parseLong(timestamp) * 1000));
                } catch (NumberFormatException nfe) {
                    nfe.printStackTrace();
                    System.out.println("Invalid number returned by timestmp:" + timestamp);
                }
            }
            String userFromTo = getUser(txnType, serverID, nymID, accountID, transaction);
            String nymUserID = userFromTo;
            String accountFromTo = getAccount(txnType, serverID, nymID, accountID, transaction);
            String accountInboxID = accountFromTo;
            if (!Utility.VerifyStringVal(userFromTo)) {
                userFromTo = "";
            } else {
                userFromTo = !Utility.VerifyStringVal(otapiJNI.OTAPI_Basic_GetNym_Name(userFromTo)) ? userFromTo : otapiJNI.OTAPI_Basic_GetNym_Name(userFromTo);
            }
            if (!Utility.VerifyStringVal(accountFromTo)) {
                accountFromTo = "";
            } else {
                accountFromTo = !Utility.VerifyStringVal(otapiJNI.OTAPI_Basic_GetAccountWallet_Name(accountFromTo)) ? accountFromTo : otapiJNI.OTAPI_Basic_GetAccountWallet_Name(accountFromTo);
            }

            String note = "";

            if (Utility.VerifyStringVal(txnType) && "pending".equalsIgnoreCase(txnType)) {
                note = otapiJNI.OTAPI_Basic_Pending_GetNote(serverID, nymID, accountID, transaction);
            }

            String[] row = new String[11];
            row[0] = transactionID;
            row[1] = referenceNumber;
            row[2] = amount;
            row[3] = txnType;
            row[4] = userFromTo;
            row[5] = accountFromTo;
            row[6] = timestamp;
            row[7] = String.valueOf(i);
            row[10] = note;
            row[8] = nymUserID;
            row[9] = accountInboxID;


            data.put(row[7], row);

        }

        return data;
    }

    public Map getOutboxData(String accountID) throws InterruptedException {

        Map data = new HashMap();
        String serverID = otapiJNI.OTAPI_Basic_GetAccountWallet_ServerID(accountID);
        String nymID = otapiJNI.OTAPI_Basic_GetAccountWallet_NymID(accountID);

        // The caller now does this.
//      Utility.getOutboxLowLevel(serverID, nymID, accountID);        

        String ledger = otapiJNI.OTAPI_Basic_LoadOutbox(serverID, nymID, accountID);

        if (!Utility.VerifyStringVal(ledger)) {
            return data;
        }

        int count = otapiJNI.OTAPI_Basic_Ledger_GetCount(serverID, nymID, accountID, ledger);

        for (int i = 0; i < count; i++) {

            String transactionID = otapiJNI.OTAPI_Basic_Ledger_GetTransactionIDByIndex(serverID, nymID, accountID, ledger, i);
            String transaction = otapiJNI.OTAPI_Basic_Ledger_GetTransactionByIndex(serverID, nymID, accountID, ledger, i);

            if (!Utility.VerifyStringVal(transaction)) {
                System.out.println("Skip this record, since OT_API_Ledger_GetTransactionByIndex has returned null");
                continue;
            }
            String txnType = otapiJNI.OTAPI_Basic_Transaction_GetType(serverID, nymID, accountID, transaction);
            System.out.println("In Outbox, type of txn is :" + txnType);
            String amount = "-" + otapiJNI.OTAPI_Basic_Transaction_GetAmount(serverID, nymID, accountID, transaction);
            String referenceNumber = otapiJNI.OTAPI_Basic_Transaction_GetDisplayReferenceToNum(serverID, nymID, accountID, transaction);
            String timestamp = otapiJNI.OTAPI_Basic_Transaction_GetDateSigned(serverID, nymID, accountID, transaction);
            System.out.println("timestamp:" + timestamp);
            if (!Utility.VerifyStringVal(timestamp)) {
                timestamp = "";
            } else {
                try {
                    timestamp = String.valueOf(new Date(Long.parseLong(timestamp) * 1000));
                } catch (NumberFormatException nfe) {
                    nfe.printStackTrace();
                    System.out.println("Invalid number returned by timestmp:" + timestamp);
                }
            }

            System.out.println("serverID:" + serverID + " nymID:" + nymID + " accountID:" + accountID);

            String userFromTo = otapiJNI.OTAPI_Basic_Transaction_GetRecipientUserID(serverID, nymID, accountID, transaction);
            String accountFromTo = otapiJNI.OTAPI_Basic_Transaction_GetRecipientAcctID(serverID, nymID, accountID, transaction);
            String nymUserID = userFromTo;
            String accountOutboxID = accountFromTo;
            System.out.println("recepient nym id returned by OT_API_Transaction_GetRecipientUserID:" + userFromTo);
            if (!Utility.VerifyStringVal(userFromTo)) {
                userFromTo = "";
            } else {
                userFromTo = otapiJNI.OTAPI_Basic_GetNym_Name(userFromTo) == null ? userFromTo : otapiJNI.OTAPI_Basic_GetNym_Name(userFromTo);
            }


            if (!Utility.VerifyStringVal(accountFromTo)) {
                accountFromTo = "";
            } else {
                accountFromTo = otapiJNI.OTAPI_Basic_GetAccountWallet_Name(accountFromTo) == null ? accountFromTo : otapiJNI.OTAPI_Basic_GetAccountWallet_Name(accountFromTo);
            }


            String note = "";

            if (Utility.VerifyStringVal(txnType) && "pending".equalsIgnoreCase(txnType)) {
                note = otapiJNI.OTAPI_Basic_Pending_GetNote(serverID, nymID, accountID, transaction);
            }
            System.out.println("final recepient nym id/name:" + userFromTo);
            String[] row = new String[11];
            row[0] = transactionID;
            row[1] = referenceNumber;
            row[2] = amount;
            row[3] = txnType;
            row[4] = userFromTo;
            row[5] = accountFromTo;
            row[6] = timestamp;
            row[7] = String.valueOf(i);
            row[10] = note;
            row[8] = nymUserID;
            row[9] = accountOutboxID;
            data.put(row[7], row);

        }

        return data;

    }

    public String getUser(String txnType, String serverID, String nymID, String accountID, String transaction) {

        String user = "";
        if (Utility.VerifyStringVal(txnType) && "pending".equalsIgnoreCase(txnType)) {
            user = otapiJNI.OTAPI_Basic_Transaction_GetSenderUserID(serverID, nymID, accountID, transaction);
        } else if ("chequeReceipt".equalsIgnoreCase(txnType) || "transferReceipt".equalsIgnoreCase(txnType)
                || "marketReceipt".equalsIgnoreCase(txnType) || "paymentReceipt   ".equalsIgnoreCase(txnType)) {

            user = otapiJNI.OTAPI_Basic_Transaction_GetRecipientUserID(serverID, nymID, accountID, transaction);

        }

        return user;

    }

    public String getAccount(String txnType, String serverID, String nymID, String accountID, String transaction) {

        String account = "";
        if (Utility.VerifyStringVal(txnType) && "pending".equalsIgnoreCase(txnType)) {
            account = otapiJNI.OTAPI_Basic_Transaction_GetSenderAcctID(serverID, nymID, accountID, transaction);
        } else if ("chequeReceipt".equalsIgnoreCase(txnType) || "transferReceipt".equalsIgnoreCase(txnType)
                || "marketReceipt".equalsIgnoreCase(txnType) || "paymentReceipt   ".equalsIgnoreCase(txnType)) {

            account = otapiJNI.OTAPI_Basic_Transaction_GetRecipientAcctID(serverID, nymID, accountID, transaction);

        }

        return account;

    }

    public String[] getPurseBalance(String serverID, String assetID, String nymID) {

        String purse = otapiJNI.OTAPI_Basic_LoadPurse(serverID, assetID, nymID);
        if (!Utility.VerifyStringVal(purse)) {
            return null;
        }
        String balance = otapiJNI.OTAPI_Basic_Purse_GetTotalValue(serverID, assetID, purse);

        return new String[]{purse, balance};

    }

    public boolean depositCash(String serverID, String nymID, String accountID, String purse, boolean isToken) {

        System.out.println("In depositCash serverID:" + serverID + " nymID:" + nymID + " acount ID:" + accountID + " isToken:" + isToken);
        Helpers.setOtDepositCash(null);
        String oldPurse = purse;
        if (isToken) {
            purse = getNewPurse(purse, serverID, nymID, accountID);
            System.out.println("purse after getting from push purse:" + purse);
            if (!Utility.VerifyStringVal(purse)) {
                Helpers.setOtDepositCash(oldPurse);
                return false;
            }
        }
        // ----------------------------------------
        OTAPI_Func theRequest = new OTAPI_Func(OTAPI_Func.FT.DEPOSIT_CASH, serverID, nymID, accountID, purse);
        String strResponse = OTAPI_Func.SendTransaction(theRequest, "DEPOSIT_CASH"); // <========================

        if (!Utility.VerifyStringVal(strResponse)) {
            System.out.println("IN depositCash: OTAPI_Func.SendTransaction(() failed. (I give up.) ");

            if (isToken) {
                System.out.println("IN depositCash, failed action for single token");
                String assetID = otapiJNI.OTAPI_Basic_GetAccountWallet_AssetTypeID(accountID);
                boolean importStatus = otapiJNI.OTAPI_Basic_Wallet_ImportPurse(serverID, assetID, nymID, purse);
                System.out.println("Since failure of depositCashPurse, OT_API_Wallet_ImportPurse called, status of import:" + importStatus);
                if (!importStatus) {
                    Helpers.setOtDepositCash(purse);
                }
            }

            return false;
        }
        // ----------------------------------------
        return true;
    }

    public String withdrawVoucher(String serverID, String nymID, String accountID, String amount, String chequeMemo, String recepientNymID) {

        System.out.println("In withdrawVoucher serverID:" + serverID + " nymID:" + nymID + " acount ID:" + accountID);

        // ---------------------------------------------------
        OTAPI_Func theRequest = new OTAPI_Func(OTAPI_Func.FT.WITHDRAW_VOUCHER, serverID, nymID, accountID, recepientNymID, chequeMemo, amount);
        String strResponse = OTAPI_Func.SendTransaction(theRequest, "WITHDRAW_VOUCHER"); // <========================

        if (!Utility.VerifyStringVal(strResponse)) {
            System.out.println("OTAPI_Func.SendTransaction() failed, in withdrawVoucher.");
            return null;
        }
        // ---------------------------------------------------------
        String ledger = otapiJNI.OTAPI_Basic_Message_GetLedger(strResponse);
        if (!Utility.VerifyStringVal(ledger)) {
            System.out.println(" ledger is null, returned by OT_API_Message_GetLedger, serverResponseMessage passed as argument");
            return null;
        }
        String transaction = otapiJNI.OTAPI_Basic_Ledger_GetTransactionByIndex(serverID, nymID, accountID, ledger, 0);
        if (!Utility.VerifyStringVal(transaction)) {
            System.out.println("withdrawVoucher: transaction is null, returned by OT_API_Ledger_GetTransactionByIndex, argument passed, index 0 and ledger :" + ledger);
            return null;
        }
        // ---------------------------------------------------------
        String output = otapiJNI.OTAPI_Basic_Transaction_GetVoucher(serverID, nymID, accountID, transaction);
        System.out.println("output returned by OT_API_Transaction_GetVoucher:" + output);

        return output;
    }

    public boolean withdrawCash(String serverID, String nymID, String accountID, String amount) 
    {
        String serverResponseMessage = null;
        System.out.println("In withdrawCash serverID:" + serverID + " nymID:" + nymID + " acount ID:" + accountID);
        String assetID = otapiJNI.OTAPI_Basic_GetAccountWallet_AssetTypeID(accountID);

        // ---------------------------------------- 
        // Make sure we have the proper asset contract for the withdrawal.
        //
        String assetContract = otapiJNI.OTAPI_Basic_LoadAssetContract(assetID);
        if (!Utility.VerifyStringVal(assetContract)) {
            OTAPI_Func theRequest = new OTAPI_Func(OTAPI_Func.FT.GET_CONTRACT, serverID, nymID, assetID);
            String strResponse = OTAPI_Func.SendRequest(theRequest, "GET_CONTRACT");

            if (!Utility.VerifyStringVal(strResponse)) {
                System.out.println("IN withdrawCash: OTAPI_Func.SendRequest(GET_CONTRACT) failed. (I give up.) (Unable to find asset contract.)");
                return false;
            }
            // ----------------------------------------
            assetContract = otapiJNI.OTAPI_Basic_LoadAssetContract(assetID);
            if (!Utility.VerifyStringVal(assetContract)) {
                System.out.println("OT_API_LoadAssetContract returned null even after OT_API_getContract (Unable to find asset contract.)");
                return false;
            }
        }
        // ---------------------------------------------------------
        // Download the public mintfile if it's not there, or if it's expired.
        // Also load it up into memory as a string (just to make sure it works.)
        // Then we can actually send the withdrawal transaction request. (Until
        // then, why bother?)
        //
        String mintFile;

        // expired or missing.
        if (true != otapiJNI.OTAPI_Basic_Mint_IsStillGood(serverID, assetID)) 
        {
            // ----------------------------------------
            OTAPI_Func theRequest = new OTAPI_Func(OTAPI_Func.FT.GET_MINT, serverID, nymID, assetID);
            String strResponse = OTAPI_Func.SendRequest(theRequest, "GET_MINT");

            if (!Utility.VerifyStringVal(strResponse)) {
                System.out.println("IN withdrawCash: OTAPI_Func.SendRequest(GET_MINT) failed. (I give up.) (Unable to get mint.)");
                return false;
            }
            // ----------------------------------------
            mintFile = otapiJNI.OTAPI_Basic_LoadMint(serverID, assetID);
            if (!Utility.VerifyStringVal(mintFile)) {
                System.out.println("OT_API_LoadMint returned null even after OT_API_getMint (I give up.) (Unable to find mint.)");
                return false;
            }
        }
        else // current mint IS available already on local storage (and not expired.)
        {
            mintFile = otapiJNI.OTAPI_Basic_LoadMint(serverID, assetID);
            if (!Utility.VerifyStringVal(mintFile)) {
                System.out.println("OT_API_LoadMint returned null even after successful OT_API_Mint_IsStillGood (I give up.) (Unable to find mint.)");
                return false;
            }
        }        
        // ---------------------------------------------------
        // By this point, the mintfile is DEFINITELY good (available, not null, 
        // not expired, and loaded up.) Now we know for a fact that when the API
        // call is made to withdraw cash, that it will find the mint properly.
        //
        OTAPI_Func theRequest = new OTAPI_Func(OTAPI_Func.FT.WITHDRAW_CASH, serverID, nymID, accountID, amount);
        String strResponse = OTAPI_Func.SendTransaction(theRequest, "WITHDRAW_CASH"); // <========================

        if (!Utility.VerifyStringVal(strResponse)) {
            System.out.println("OTAPI_Func.SendTransaction() failed, in withdrawCash.");
            return false;
        }
        // --------------------------------------------------------------------------------------

        return true;
    }

    public boolean sendTransfer(String serverID, String nymID, String accountID, String amount, String note, String recepientAccountID) {

        boolean isSuccess = false;
        System.out.println("In sendTransfer serverID:" + serverID + " nymID:" + nymID + " acount ID:" + accountID);

        // ---------------------------------------------------
        OTAPI_Func theRequest = new OTAPI_Func(OTAPI_Func.FT.SEND_TRANSFER, serverID, nymID, accountID, recepientAccountID, amount, note);
        String strResponse = OTAPI_Func.SendTransaction(theRequest, "SEND_TRANSFER"); // <========================

        if (!Utility.VerifyStringVal(strResponse)) {
            System.out.println("OTAPI_Func.SendTransaction() failed, in sendTransfer.");
            return false;
        }
        // -------------------------------------------------------------------------------------- 
        // No need to do anything like this, since the caller already re-downloads
        // the intermediary files after success.
//      if (false == Utility.getIntermediaryFiles(serverID, nymID, accountID))
//      {
//          System.out.println("sendTransfer: getIntermediaryFiles returned false. (I give up.)");
//          return null;
//      }

        return true;
    }

    public boolean depositCheque(String serverID, String nymID, String accountID, String cheque) {

        System.out.println("In depositCheque serverID:" + serverID + " nymID:" + nymID + " acount ID:" + accountID);

        // ---------------------------------------------------
        OTAPI_Func theRequest = new OTAPI_Func(OTAPI_Func.FT.DEPOSIT_CHEQUE, serverID, nymID, accountID, cheque);
        String strResponse = OTAPI_Func.SendTransaction(theRequest, "DEPOSIT_CHEQUE"); // <========================

        if (!Utility.VerifyStringVal(strResponse)) {
            System.out.println("OTAPI_Func.SendTransaction() failed, in depositCheque.");
            return false;
        }
        // -------------------------------------------------------------------------------------- 

        return true;
    }

    public String writeCheque(String serverID, String nymID, String accountID, String validFrom, String validTo, String memo, String recepientNymID, String amount) {
        String cheque = "";
        System.out.println("In writeCheque serverID:" + serverID + " nymID:" + nymID);

        boolean bSure = true;
        if (otapiJNI.OTAPI_Basic_GetNym_TransactionNumCount(serverID, nymID) < Configuration.getNbrTransactionCount()) {

            Helpers.getTransactionNumbers(serverID, nymID);
            bSure = Helpers.getTransactionNumbers(serverID, nymID);
        }
        if (!bSure || otapiJNI.OTAPI_Basic_GetNym_TransactionNumCount(serverID, nymID) < Configuration.getNbrTransactionCount()) {
            System.out.println("In writeCheque , failed to get transaction numbers, OT_API_GetNym_TransactionNumCount:" + otapiJNI.OTAPI_Basic_GetNym_TransactionNumCount(serverID, nymID));
            return null;
        }
        System.out.println("validTo:" + validTo);
        cheque = otapiJNI.OTAPI_Basic_WriteCheque(serverID, amount, validFrom, validTo, accountID, nymID, memo, recepientNymID);
        System.out.println("cheque:" + cheque);
        return cheque;
    }

    private String getNewPurse(String purse, String serverID, String nymID, String accountID) {
        String updatedPurse = purse;
        String assetID = otapiJNI.OTAPI_Basic_GetAccountWallet_AssetTypeID(accountID);
        String newPurse = otapiJNI.OTAPI_Basic_CreatePurse(serverID, assetID, nymID, nymID);
        if (!Utility.VerifyStringVal(newPurse)) {
            System.out.println("getNewPurse , OT_API_CreatePurse returns null, hence passing back same purse");
            return updatedPurse;
        }
        updatedPurse = otapiJNI.OTAPI_Basic_Purse_Push(serverID, assetID, nymID, nymID, newPurse, purse);
        System.out.println("getNewPurse ,updatedPurse");
        return updatedPurse;

    }

    public int verifyFiles(String serverID, String nymID, String accountID) {
        String filenameAcct = accountID + ".success";
        String filenameNym = nymID + ".success";
        if (!otapi.Exists("receipts", serverID, filenameAcct)
                && !otapi.Exists("receipts", serverID, filenameNym)) {
            return 2;
        }

        boolean status = otapiJNI.OTAPI_Basic_VerifyAccountReceipt(serverID, nymID, accountID);
        if (status) {
            return 0;
        } else {
            return 1;
        }
    }
}
