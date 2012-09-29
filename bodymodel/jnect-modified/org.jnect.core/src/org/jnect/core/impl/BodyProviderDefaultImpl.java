package org.jnect.core.impl;

import org.jnect.bodymodel.Body;
import org.jnect.bodymodel.BodymodelFactory;
import org.jnect.bodymodel.CenterHip;
import org.jnect.bodymodel.CenterShoulder;
import org.jnect.bodymodel.Head;
import org.jnect.bodymodel.HumanLink;
import org.jnect.bodymodel.LeftAnkle;
import org.jnect.bodymodel.LeftElbow;
import org.jnect.bodymodel.LeftFoot;
import org.jnect.bodymodel.LeftHand;
import org.jnect.bodymodel.LeftHip;
import org.jnect.bodymodel.LeftKnee;
import org.jnect.bodymodel.LeftShoulder;
import org.jnect.bodymodel.LeftWrist;
import org.jnect.bodymodel.PositionedElement;
import org.jnect.bodymodel.RightAnkle;
import org.jnect.bodymodel.RightElbow;
import org.jnect.bodymodel.RightFoot;
import org.jnect.bodymodel.RightHand;
import org.jnect.bodymodel.RightHip;
import org.jnect.bodymodel.RightKnee;
import org.jnect.bodymodel.RightShoulder;
import org.jnect.bodymodel.RightWrist;
import org.jnect.bodymodel.Spine;
import org.jnect.core.IBodyProvider;

public class BodyProviderDefaultImpl implements IBodyProvider {
	Body body = createAndFillBody();

	@Override
	public Body getBody() {
		return body;
	}

	@Override
	public boolean isRecording() {
		return false;
	}

	private Body createAndFillBody() {
		BodymodelFactory factory = BodymodelFactory.eINSTANCE;
		// create Elements
		Head head = factory.createHead();
		CenterShoulder shoulderCenter = factory.createCenterShoulder();
		LeftShoulder shoulderLeft = factory.createLeftShoulder();
		RightShoulder shoulderRight = factory.createRightShoulder();
		LeftElbow elbowLeft = factory.createLeftElbow();
		RightElbow elbowRight = factory.createRightElbow();
		LeftWrist wristLeft = factory.createLeftWrist();
		RightWrist wristRight = factory.createRightWrist();
		LeftHand handLeft = factory.createLeftHand();
		RightHand handRight = factory.createRightHand();
		Spine spine = factory.createSpine();
		CenterHip hipCenter = factory.createCenterHip();
		LeftHip hipLeft = factory.createLeftHip();
		RightHip hipRight = factory.createRightHip();
		LeftKnee kneeLeft = factory.createLeftKnee();
		RightKnee kneeRight = factory.createRightKnee();
		LeftAnkle ankleLeft = factory.createLeftAnkle();
		RightAnkle ankleRight = factory.createRightAnkle();
		LeftFoot footLeft = factory.createLeftFoot();
		RightFoot footRight = factory.createRightFoot();

		// set color
//		footLeft.setColor_g(255);
//		footRight.setColor_g(255);
//		handLeft.setColor_r(255);
//		handLeft.setColor_g(0);
//		handLeft.setColor_b(0);
//		handRight.setColor_r(255);
//		head.setColor_b(255);
		Body createdBody = factory.createBody();
		// add elements to body
		createdBody.setHead(head);
		createdBody.setLeftAnkle(ankleLeft);
		createdBody.setRightAnkle(ankleRight);
		createdBody.setLeftElbow(elbowLeft);
		createdBody.setRightElbow(elbowRight);
		createdBody.setLeftFoot(footLeft);
		createdBody.setRightFoot(footRight);
		createdBody.setLeftHand(handLeft);
		createdBody.setRightHand(handRight);
		createdBody.setCenterHip(hipCenter);
		createdBody.setLeftHip(hipLeft);
		createdBody.setRightHip(hipRight);
		createdBody.setLeftKnee(kneeLeft);
		createdBody.setRightKnee(kneeRight);
		createdBody.setCenterShoulder(shoulderCenter);
		createdBody.setLeftShoulder(shoulderLeft);
		createdBody.setRightShoulder(shoulderRight);
		createdBody.setSpine(spine);
		createdBody.setLeftWrist(wristLeft);
		createdBody.setRightWrist(wristRight);

		// create links
		createLink(head, shoulderCenter, createdBody);
		createLink(shoulderCenter, shoulderLeft, createdBody);
		createLink(shoulderCenter, shoulderRight, createdBody);
		createLink(shoulderLeft, elbowLeft, createdBody);
		createLink(shoulderRight, elbowRight, createdBody);
		createLink(elbowLeft, wristLeft, createdBody);
		createLink(elbowRight, wristRight, createdBody);
		createLink(wristLeft, handLeft, createdBody);
		createLink(wristRight, handRight, createdBody);
		createLink(shoulderCenter, spine, createdBody);
		createLink(spine, hipCenter, createdBody);
		createLink(hipCenter, hipLeft, createdBody);
		createLink(hipCenter, hipRight, createdBody);
		createLink(hipLeft, kneeLeft, createdBody);
		createLink(hipRight, kneeRight, createdBody);
		createLink(kneeLeft, ankleLeft, createdBody);
		createLink(kneeRight, ankleRight, createdBody);
		createLink(ankleLeft, footLeft, createdBody);
		createLink(ankleRight, footRight, createdBody);
		return createdBody;
	}

	private void createLink(PositionedElement source, PositionedElement target, Body body) {
		HumanLink link = BodymodelFactory.eINSTANCE.createHumanLink();
		link.setSource(source);
		link.setTarget(target);

		source.getOutgoingLinks().add(link);
		target.getIncomingLinks().add(link);

		body.getLinks().add(link);
	}

	@Override
	public void startStopRecoring(boolean on) {
		// do nothing, as the default impl does not record
	}
}
