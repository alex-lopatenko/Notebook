package com.example.notebookjava.db;

import com.example.notebookjava.adapter.ListItem;

import java.util.List;

public interface OnDataReceived {
    void onReceived(List<ListItem> list);
}
