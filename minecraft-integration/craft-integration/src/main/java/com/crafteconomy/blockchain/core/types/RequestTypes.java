package com.crafteconomy.blockchain.core.types;

/**
 * Used to store blockchainapi request string for request
 */
public enum RequestTypes {
    BALANCE("balance"), 
    SUPPLY("amount"),
    ESCROW(""), // escrow balance in game
    FAUCET("");

    public String json_key;

    RequestTypes(String json_key) {
        this.json_key = json_key;
    }
}
