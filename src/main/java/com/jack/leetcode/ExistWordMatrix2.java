package com.jack.leetcode;

import com.jack.util.Trie;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Author: Jack
 * @Date: 2018/9/20 14:01
 * LeetCode 212
 * 单词搜索 II
 * 给定一个二维网格 board 和一个字典中的单词列表 words，
 * 找出所有同时在二维网格和字典中出现的单词。
 * 单词必须按照字母顺序，通过相邻的单元格内的字母构成，
 * 其中“相邻”单元格是那些水平相邻或垂直相邻的单元格。
 * 同一个单元格内的字母在一个单词中不允许被重复使用。
 * 例:
 * 输入:
 * words = ["oath","pea","eat","rain"] and board =
 * [
 *   ['o','a','a','n'],
 *   ['e','t','a','e'],
 *   ['i','h','k','r'],
 *   ['i','f','l','v']
 * ]
 * 输出: ["eat","oath"]
 * 你可以假设所有输入都由小写字母 a-z 组成。
 * 你需要优化回溯算法以通过更大数据量的测试。你能否早点停止回溯？
 * 如果当前单词不存在于所有单词的前缀中，则可以立即停止回溯。
 * 什么样的数据结构可以有效地执行这样的操作？
 * 散列表是否可行？为什么？ 前缀树如何？
 * 如果你想学习如何实现一个基本的前缀树，请先查看这个问题：
 */
public class ExistWordMatrix2 {
    public static void main(String[] args) {
        String[] words = {"oath", "pea", "eat", "rain"};
        char[][] chars = {{'o', 'a', 'a', 'n'},
                {'e', 't', 'a', 'e'},
                {'i', 'h', 'k', 'r'},
                {'i', 'f', 'l', 'v'}};
        ExistWordMatrix2 matrix2 = new ExistWordMatrix2();
        System.out.println(matrix2.findWords(chars, words));
    }
    Set<String> res = new HashSet<>();

    /**
     * 使用dfs不能确定何时结束递归。
     * 当发现当前字符串继续往下递归也不可能时需要找的任何一个时
     * 使用前缀树，当发现当前字符串不是要找任何字符串的前缀时，
     * 则结束搜素，这样降低了时间复杂度。
     * @param board
     * @param words
     * @return
     */
    private List<String> findWords(char[][] board, String[] words) {
        Trie trie = new Trie();
        for (String s : words) {
            trie.insert(s);
        }
        int n = board.length;
        if (n < 1)
            return new ArrayList<>(res);
        int m = board[0].length;
        boolean[][] visited = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                findWords(board, visited, "", i, j, trie);
            }
        }
        return new ArrayList<>(res);
    }
    public void findWords(char[][] board, boolean[][] visited, String str, int x, int y, Trie trie) {
        if (x < 0 || x >= board.length || y < 0 || y >= board[0].length)
            return;
        if (visited[x][y])
            return;
        String newStr = str + board[x][y];
        if (!trie.startWith(newStr))
            return;
        if (trie.search(newStr))
            res.add(newStr);
        visited[x][y] = true;
        findWords(board, visited, newStr, x - 1, y, trie);
        findWords(board, visited, newStr, x + 1, y, trie);
        findWords(board, visited, newStr, x, y - 1, trie);
        findWords(board, visited, newStr, x, y + 1, trie);
        visited[x][y] = false;
    }
}