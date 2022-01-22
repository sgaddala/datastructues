package linkedlist;

public class LinkedList {

	Node Head = null;
	Node Last = null;

	public LinkedList() {

	}

	public LinkedList(Node head) {
		this.Head = head;
	}

	public Node AddElement(int data) {

		if (this.Head == null) {

			this.Last = new Node(data);

			this.Head = this.Last;
			return this.Head;
		}

		else {

			this.Last.next = new Node(data);
			this.Last = this.Last.next;

			return this.Head;
		}

	}

	public Node PopElement() {

		if (this.Head == null) {

			System.out.println("List Empty");

		} else {

			Node temp = this.Head;
			while (temp.next != this.Last)

			{
				temp = temp.next;
			}

			this.Last = temp;
			temp.next = null;

		}

		return this.Head;
	}

	public void DisplayElements() {

		Node Last = this.Head;
		if (Last == null) {
			System.out.println("List Empty");
		}
		while (Last != null) {

			System.out.println(Last.data);
			Last = Last.next;

		}

	}

}
