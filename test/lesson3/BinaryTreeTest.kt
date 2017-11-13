package lesson3

import org.junit.Test

import org.junit.Assert.*

class BinaryTreeTest {
    @Test
    fun add() {
        val tree = BinaryTree<Int>()
        tree.add(10)
        tree.add(5)
        tree.add(7)
        tree.add(10)
        assertEquals(3, tree.size)
        assertTrue(tree.contains(5))
        tree.add(3)
        tree.add(1)
        tree.add(3)
        tree.add(4)
        assertEquals(6, tree.size)
        assertFalse(tree.contains(8))
        tree.add(8)
        tree.add(15)
        tree.add(15)
        tree.add(20)
        assertEquals(9, tree.size)
        assertTrue(tree.contains(8))
        assertTrue(tree.checkInvariant())
        assertEquals(1, tree.first())
        assertEquals(20, tree.last())
    }

    @Test
    fun addKotlin() {
        val tree = KtBinaryTree<Int>()
        tree.add(10)
        tree.add(5)
        tree.add(7)
        tree.add(10)
        assertEquals(3, tree.size)
        assertTrue(tree.contains(5))
        tree.add(3)
        tree.add(1)
        tree.add(3)
        tree.add(4)
        assertEquals(6, tree.size)
        assertFalse(tree.contains(8))
        tree.add(8)
        tree.add(15)
        tree.add(15)
        tree.add(20)
        assertEquals(9, tree.size)
        assertTrue(tree.contains(8))
        assertTrue(tree.checkInvariant())
        assertEquals(1, tree.first())
        assertEquals(20, tree.last())
    }

    @Test
    fun tail() {
        val tree = BinaryTree<Int>()
        tree.add(7)
        tree.add(3)
        tree.add(2)
        tree.add(1)
        tree.add(5)
        tree.add(15)
        tree.add(10)
        tree.add(8)
        tree.add(11)
        tree.add(12)
        tree.add(16)
        val tail = tree.tailSet(7)
        assertEquals(7, tail.size)
        assertTrue(tail.contains(7))
        assertTrue(tail.contains(15))
        assertTrue(tail.contains(10))
        assertTrue(tail.contains(16))
        assertTrue(tail.contains(8))
        assertTrue(tail.contains(11))
        assertTrue(tail.contains(12))
    }

    @Test
    fun head1() {
        val tree = BinaryTree<Int>()
        tree.add(7)
        tree.add(3)
        tree.add(2)
        tree.add(1)
        tree.add(5)
        tree.add(15)
        tree.add(10)
        tree.add(8)
        tree.add(11)
        tree.add(12)
        tree.add(16)
        val head = tree.headSet(7)
        assertEquals(4, head.size)
        assertTrue(head.contains(3))
        assertTrue(head.contains(2))
        assertTrue(head.contains(5))
        assertTrue(head.contains(1))
    }

    @Test
    fun head2() {
        val tree = BinaryTree<Int>()
        tree.add(7)
        tree.add(3)
        tree.add(2)
        tree.add(1)
        tree.add(5)
        tree.add(15)
        tree.add(10)
        tree.add(8)
        tree.add(11)
        tree.add(12)
        tree.add(16)
        val head = tree.headSet(13)
        assertEquals(9, head.size)
        assertTrue(head.contains(3))
        assertTrue(head.contains(2))
        assertTrue(head.contains(5))
        assertTrue(head.contains(1))
        assertTrue(head.contains(7))
        assertTrue(head.contains(10))
        assertTrue(head.contains(8))
        assertTrue(head.contains(11))
        assertTrue(head.contains(12))
    }

    @Test
    fun head3() {
        val tree = BinaryTree<Int>()
        tree.add(7)
        tree.add(3)
        tree.add(2)
        tree.add(1)
        tree.add(5)
        tree.add(15)
        tree.add(10)
        tree.add(8)
        tree.add(11)
        tree.add(12)
        tree.add(16)
        val head = tree.headSet(3)
        assertEquals(2, head.size)
        assertTrue(head.contains(2))
        assertTrue(head.contains(1))
    }
}