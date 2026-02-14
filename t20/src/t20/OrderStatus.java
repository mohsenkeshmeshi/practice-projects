package t20;

public enum OrderStatus {
	
	PENDING{
		@Override
		public OrderStatus nextStatus() {
			return PROCESSING; 
		}
	},
	PROCESSING{
		@Override
		public OrderStatus nextStatus() {
			return SHIPPED; 
		}
	},
	SHIPPED{
		@Override
		public OrderStatus nextStatus() {
			return DELIVERED; 
		}
	},
	DELIVERED{
		@Override
		public OrderStatus nextStatus() {
			return CANCELLED; 
		}
	},
	CANCELLED{
		@Override
		public OrderStatus nextStatus() {
			return PENDING; 
		}
	};
	public abstract OrderStatus nextStatus();
}
