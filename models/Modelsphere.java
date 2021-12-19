// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

public static class Modelsphere extends EntityModel<Entity> {
	private final ModelRenderer bone6;
	private final ModelRenderer bone;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer bone2;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer bone3;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer bone4;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer bone5;
	private final ModelRenderer cube_r13;
	private final ModelRenderer cube_r14;
	private final ModelRenderer cube_r15;

	public Modelsphere() {
		textureWidth = 16;
		textureHeight = 16;

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(0.0F, 24.0F, 0.0F);

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone6.addChild(bone);
		bone.setTextureOffset(0, 0).addBox(-250.0F, -125.0F, -125.0F, 500.0F, 250.0F, 250.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, -2.3562F, 0.0F);
		cube_r1.setTextureOffset(0, 0).addBox(-250.0F, -125.0F, -125.0F, 500.0F, 250.0F, 250.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, -1.5708F, 0.0F);
		cube_r2.setTextureOffset(0, 0).addBox(-250.0F, -125.0F, -125.0F, 500.0F, 250.0F, 250.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, -0.7854F, 0.0F);
		cube_r3.setTextureOffset(0, 0).addBox(-250.0F, -125.0F, -125.0F, 500.0F, 250.0F, 250.0F, 0.0F, false);

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone6.addChild(bone2);
		setRotationAngle(bone2, -1.5708F, 0.0F, 0.0F);
		bone2.setTextureOffset(0, 0).addBox(-250.0F, -125.0F, -125.0F, 500.0F, 250.0F, 250.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone2.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, -2.3562F, 0.0F);
		cube_r4.setTextureOffset(0, 0).addBox(-250.0F, -125.0F, -125.0F, 500.0F, 250.0F, 250.0F, 0.0F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone2.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, -1.5708F, 0.0F);
		cube_r5.setTextureOffset(0, 0).addBox(-250.0F, -125.0F, -125.0F, 500.0F, 250.0F, 250.0F, 0.0F, false);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone2.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, -0.7854F, 0.0F);
		cube_r6.setTextureOffset(0, 0).addBox(-250.0F, -125.0F, -125.0F, 500.0F, 250.0F, 250.0F, 0.0F, false);

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone6.addChild(bone3);
		setRotationAngle(bone3, 0.0F, 0.0F, 1.5708F);
		bone3.setTextureOffset(0, 0).addBox(-250.0F, -125.0F, -125.0F, 500.0F, 250.0F, 250.0F, 0.0F, false);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone3.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, -2.3562F, 0.0F);
		cube_r7.setTextureOffset(0, 0).addBox(-250.0F, -125.0F, -125.0F, 500.0F, 250.0F, 250.0F, 0.0F, false);

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone3.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, -1.5708F, 0.0F);
		cube_r8.setTextureOffset(0, 0).addBox(-250.0F, -125.0F, -125.0F, 500.0F, 250.0F, 250.0F, 0.0F, false);

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone3.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, -0.7854F, 0.0F);
		cube_r9.setTextureOffset(0, 0).addBox(-250.0F, -125.0F, -125.0F, 500.0F, 250.0F, 250.0F, 0.0F, false);

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone6.addChild(bone4);
		setRotationAngle(bone4, -0.7854F, 0.0F, 1.5708F);
		bone4.setTextureOffset(0, 0).addBox(-250.0F, -125.0F, -125.0F, 500.0F, 250.0F, 250.0F, 0.0F, false);

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone4.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, -2.3562F, 0.0F);
		cube_r10.setTextureOffset(0, 0).addBox(-250.0F, -125.0F, -125.0F, 500.0F, 250.0F, 250.0F, 0.0F, false);

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone4.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, -1.5708F, 0.0F);
		cube_r11.setTextureOffset(0, 0).addBox(-250.0F, -125.0F, -125.0F, 500.0F, 250.0F, 250.0F, 0.0F, false);

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone4.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.0F, -0.7854F, 0.0F);
		cube_r12.setTextureOffset(0, 0).addBox(-250.0F, -125.0F, -125.0F, 500.0F, 250.0F, 250.0F, 0.0F, false);

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone6.addChild(bone5);
		setRotationAngle(bone5, -2.3562F, 0.0F, 1.5708F);
		bone5.setTextureOffset(0, 0).addBox(-250.0F, -125.0F, -125.0F, 500.0F, 250.0F, 250.0F, 0.0F, false);

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone5.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0F, -2.3562F, 0.0F);
		cube_r13.setTextureOffset(0, 0).addBox(-250.0F, -125.0F, -125.0F, 500.0F, 250.0F, 250.0F, 0.0F, false);

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone5.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.0F, -1.5708F, 0.0F);
		cube_r14.setTextureOffset(0, 0).addBox(-250.0F, -125.0F, -125.0F, 500.0F, 250.0F, 250.0F, 0.0F, false);

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone5.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.0F, -0.7854F, 0.0F);
		cube_r15.setTextureOffset(0, 0).addBox(-250.0F, -125.0F, -125.0F, 500.0F, 250.0F, 250.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		bone6.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
	}
}