| 기능 | 메서드 | URL | 응답 |
|---|---|---|---|
| 관심 상품 등록하기 | POST | `/api/products` | ProductResponseDto |
| 관심 상품의 희망 최저가 업데이트 | PUT | `/api/products/{id}` | ProductResponseDto |
| 관심 상품 조회하기 | GET | `/api/products` | List<ProductResponseDto> |