public ListNode mergeKLists(ListNode[] lists) {
        
        if(lists==null || lists.length == 0) return null;
        
        PriorityQueue<ListNode> queue = new PriorityQueue<>
                (Comparator.comparing((ListNode l) ->l.val));
        
       
        for(ListNode l:lists)
            
            if(l!=null)queue.add(l);
        
        
        ListNode l3 = new ListNode(-1);
        
        ListNode head = l3; // return l3.next 
            
            
        
        while(!queue.isEmpty()){
            
            ListNode l = queue.poll();
            l3.next = l;
            l = l.next;
            if(l!=null)
                queue.offer(l);
            
            l3 = l3.next;   
            
        }
        
        
        return head.next;
        
            
        
        
        
    }
